package iteration;

public class lottoNumbers {
    public static void main(String[] args) {
        int nums[] = new int[7];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 21);
        }

        long attempt = 0;
        Boolean jeckpot = false;
        while(jeckpot == false){
            attempt++;
            for(int i = 0; i < nums.length; ){
                int random = (int)(Math.random() * 21);
                if(random != nums[i]){
                    break;
                }

                i++;
                jeckpot = (i == nums.length) ? true : false;
            }
        }

        for(var a : nums){
            System.out.print(a +  " ");
        }
        System.out.println();
        System.out.println(attempt);
    }
}
