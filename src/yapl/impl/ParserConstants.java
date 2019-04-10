/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 6;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 7;
  /** RegularExpression Id. */
  int ident = 54;
  /** RegularExpression Id. */
  int letter = 55;
  /** RegularExpression Id. */
  int number = 56;
  /** RegularExpression Id. */
  int string = 57;
  /** RegularExpression Id. */
  int digit = 58;
  /** RegularExpression Id. */
  int otherchar = 59;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<SINGLE_LINE_COMMENT>",
    "<FORMAL_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\">\"",
    "\"==\"",
    "\"!=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"True\"",
    "\"False\"",
    "\"[\"",
    "\"]\"",
    "\".\"",
    "\"#\"",
    "\"(\"",
    "\")\"",
    "\"And\"",
    "\"new\"",
    "\"Or\"",
    "\",\"",
    "\":=\"",
    "\"If\"",
    "\"Then\"",
    "\"Else\"",
    "\"EndIf\"",
    "\"While\"",
    "\"Do\"",
    "\"EndWhile\"",
    "\"Return\"",
    "\"Write\"",
    "\";\"",
    "\"Begin\"",
    "\"End\"",
    "\"int\"",
    "\"bool\"",
    "\"void\"",
    "\"Const\"",
    "\"=\"",
    "\"Record\"",
    "\"EndRecord\"",
    "\"Declare\"",
    "\"Procedure\"",
    "\"Program \"",
    "<ident>",
    "<letter>",
    "<number>",
    "<string>",
    "<digit>",
    "<otherchar>",
  };

}
