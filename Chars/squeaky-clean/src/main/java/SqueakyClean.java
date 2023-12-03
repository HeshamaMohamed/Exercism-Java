class SqueakyClean {
    static String clean(String identifier) {
        String noSpaces = identifier.replace(' ', '_');
        String noControlCharacters = noSpaces.replaceAll("[\\p{Cntrl}]", "CTRL");
        String camelCase = kebabToCamelCase(noControlCharacters);
        String onlyLetters = camelCase.replaceAll("[^\\p{L}_]", "");
        String noGreekLowerCase = onlyLetters.replaceAll("[\\u03B1-\\u03C9]", "");

        return noGreekLowerCase;
    }

    static String kebabToCamelCase(String kebabCase){
        String camelCase = "";
        Boolean capitalizeNext = false;

        for (char c : kebabCase.toCharArray()) {
            if (c == '-') {
                capitalizeNext = true;
            } else {
                camelCase += capitalizeNext ? Character.toUpperCase(c) : c;
                capitalizeNext = false;
            }
        }

        return camelCase;
    }
}
