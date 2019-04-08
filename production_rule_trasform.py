import re
def separate():
    f = open("wrong_tokens.txt")
    out = open("right_tokens.txt", "w")
    file = f.read()
    tokens = file.split("TOKEN :")

    names = []

    for token in tokens:
        regex = re.compile(r'<\w+:.*>')
        result = regex.findall(token)
        for line in result:
            regex = re.compile(r"<\w+: ")
            res = regex.findall(line)
            print(res)
            name = res[0]
            name = name[1:-2]
            names.append(name)
            out.write("void " + name + "(): \n{}\n{\n\t")

            regex = re.compile(": .*>$")
            res = regex.findall(line)
            body = res[0][2:-1]
            out.write(body + "\n}\n\n")

    out.close()
    read_out = open("right_tokens.txt", "r")
    out = read_out.read()
    for name in names:
        res = re.findall(re.compile(r'<' + name + '>'), out)
        print(res)
        regex = re.compile(r'<' + name + '>')
        out = re.sub(regex, name + "()", out)

    read_out.close()

    out_write = open("result.txt", "w")
    out_write.write(out)

separate()
