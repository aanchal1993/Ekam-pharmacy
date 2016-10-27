
public class valid {

    static boolean isValidName;
    static boolean isValidPhone;
    static boolean isValidEmail;
    static boolean isValidSalary;
    static boolean flag = false;

    static boolean isValidName(String a) {

        for (int i = 0; i < a.length(); i++) {
            a = a.toLowerCase();

            if ((a.charAt(i) > 'a' && a.charAt(i) < 'z') || (a.charAt(i) == ' ') || (a.charAt(i) == '.' && a.charAt(i + 1) != '.')) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static boolean isValidNumber(String a) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > '0' || a.charAt(i) < '9') {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

        static boolean isValidMoney(String a) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > '0' || a.charAt(i) < '9' || a.charAt(i) == '.') {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
    
    static boolean isValidPhone(String a) {
        if (a.length()!=10)
            return false;
        
              for (int i = 0; i < 10; i++) {
                if (a.charAt(i) < '0' || a.charAt(i) > '9') 
                 return false;
                }
            

        
        

        return true;
    }

    static boolean isOnlyAlphabets(String a) {
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) > 'a' || a.charAt(i) < 'z') && a.charAt(i) != ' ') {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static boolean isValidGender(String a) {
        for (int i = 0; i < a.length(); i++) {
            a = a.toLowerCase();
            if (a.equals("male") || a.equals("female")) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    static boolean isValidSalary(String a) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > '0' || a.charAt(i) < '9' && (a.length() > 0)) {

                flag = true;
            } else {
                flag = false;
            }
        }

        return flag;
    }

    static boolean isValidEmail(String a) {
        a = a.toLowerCase();

        boolean b = true;
        if (!a.contains("@")) {
            b = false;
        } else if (a.lastIndexOf('@') != a.indexOf('@')) {
            b = false;
        } else if (a.indexOf('@') > a.lastIndexOf('.')) {
            b = false;
        } else if (a.contains(".@")) {
            b = false;
        } else if (a.contains("@.")) {
            b = false;
        } else if (a.contains("..")) {
            b = false;
        } else if (a.startsWith(".")) {
            b = false;
        } else if (a.endsWith(".")) {
            b = false;
        } else if (a.endsWith("@")) {
            b = false;
        } else {
            char m;
            for (int i = 0; i < a.length(); i++) {
                m = a.charAt(i);
                if (m < 'a' || m > 'z') {
                    if (m < '0' || m > '9') {
                        if (m != '@') {
                            if (m != '.') {
                                if (m != '_') {
                                    if (m != '-') {
                                        b = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return b;
    }

}
