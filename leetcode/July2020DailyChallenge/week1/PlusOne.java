package week1;

class PlusOne {
    public int[] plusOne(int[] digits) {

        int[] result = new int[digits.length + 1];

        if(digits.length == 1 && digits[0] == 9){
            result[0] = 1;
            result[1] = 0;
            return result;
        }

        if(digits[digits.length - 1] == 9){
            digits[digits.length - 1] = 0;
            for(int i = digits.length - 2 ; i >= 0; i--){
                if(i == 0 && digits[i] == 9){
                    digits[i] = 0;
                    result[0] = 1;
                    for(i = 1;i<=digits.length ; i++)
                        result[i] = digits[i-1];
                    return result;
                }
                else{
                    if(digits[i] != 9){
                        digits[i]++;
                        break;
                    }
                    else
                        digits[i] = 0;
                }
            }
        }
        else
            digits[digits.length - 1]++;

        return digits;
    }
}