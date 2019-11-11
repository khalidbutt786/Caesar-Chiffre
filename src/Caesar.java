
public class Caesar implements java.lang.CharSequence{

    private String text;
    private int shift;

    public Caesar(String text, int number) {
        // TODO Auto-generated constructor stub

        this.text = text;
        this.shift = number;


    }

    public void shift() {


        if(shift == 0 || shift > 26){
            return;
        }

        String end = "";
        boolean isOverFlow = false;

        for (int i = 0; i < text.length(); i++) {

            char actualChar = text.charAt(i);

            if(actualChar == ' '){
                end = end + " ";
            }

            if(Character.isDigit(actualChar)){
                int shiftedChar = (char) ((Character.getNumericValue(actualChar) + shift) % 10);
                end = end + "" + shiftedChar;
            }

            if(Character.isLowerCase(actualChar) && Character.isLetter(actualChar)){
                if( (actualChar + shift) > 122){
                    isOverFlow = true;
                }
                if(isOverFlow){
                    int toShiftRemainder = 122 - actualChar;
                    int temp = shift - toShiftRemainder;
                    char shiftedChar = (char) (96 + temp);
                    end = end + shiftedChar;
                }
                if(!isOverFlow){
                    char shiftedChar = (char) (actualChar + shift);
                    end = end + shiftedChar;
                }
            }

            if(Character.isUpperCase(actualChar) && Character.isLetter(actualChar)){
                if( (actualChar + shift) > 90){
                    isOverFlow = true;
                }
                if(isOverFlow){
                    int toShiftRemainder = 90 - actualChar;
                    int temp = shift - toShiftRemainder;
                    char shiftedChar = (char) (64 + temp);
                    end = end + shiftedChar;
                }
                if(!isOverFlow){
                    char shiftedChar = (char) (actualChar + shift);
                    end = end + shiftedChar;
                }
            }

            isOverFlow = false;


        }
        System.out.println(end);

    }



    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public char charAt(int index) {
        // TODO Auto-generated method stub


        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // TODO Auto-generated method stub


        return null;
    }



}
