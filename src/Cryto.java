public class Cryto {

    static public String Cesar(String data, int shift) {
        StringBuilder output = new StringBuilder(data.length()); //genera nuova stringa 
        for (char singleChar : data.toCharArray()) {             //creo un array di char prendendo 1 caratere alla volta
            int shiftedChar = (int) (singleChar + shift) % 256;  
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    static public String xorAlgo(String data,String key) {

        StringBuilder result= new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char inputChar = data.charAt(i);
            char keyChar = key.charAt(i % key.length());
            //XOR operazione
            char encryptedChar=(char) (inputChar^keyChar);

            result.append(encryptedChar);
            }
            return result.toString();
        }

    }

