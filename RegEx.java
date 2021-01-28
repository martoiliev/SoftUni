package com.company;

import java.util.*;

public class RegEx {
    public static void main(String[] args) {

        // regexr.com or regex101.com -> to test and explanations about expressions;
        // [A-Z] -> finds ONE element;
        // [A-Z][a-z] -> finds the upper letter and after that finds the next lower case letter -> ex. Hello -> "He";
        // [A-Z][a-z]+ founds the whole word -> "Hello guys" -> the regex founds Hello;
        // [A-Z][a-z]* -> founds every alone upper case letter and whole words -> Hello K how Are you -> Hello, K, Are;;
        // [nvj] -> matches any character that is n,v,j -> Node.JV noVel;
        // [^abc] -> matches any character that is not a,b or c;
        // /w -> matches any word character ([A-Z][a-z][0-9]_) -> + means one ore more symbols;
        // /W -> matches any NON-WORD character (the opposite of /w);
        // /s -> matches any white-space character;
        // /S -> matches any NON-WHITE-SPACE character (the opposite of/s);
        // /d -> matches any decimal digit [0-9]; if we have number like 3.14 we would use -> /d+ /. /d+;
        // we have diff expressions in the end ( * -> means zero or more, + -> means one or more, ? -> means one or zero


        // Groups -> quantifiers
        // (subexpression) -> captures the matched subexpression as numbered group
        // /d{2} - (/w{3}) - /d{4} -> 22-Jan-2015
        // (?:subexpression) -> defines a non-capturing group
        // ^(?:Hi|hello),/s* (\w+)$ -> Hi Peter
        // (?<name>subexpression) -> defines a named capturing group
        // (?<day>\d{2}) - (?<month>\w{3}) - (?<year>\d{4}) -> 22-Jan- 2015

    }
}
