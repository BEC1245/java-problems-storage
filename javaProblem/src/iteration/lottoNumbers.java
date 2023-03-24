package iteration;

public class lottoNumbers {
	
	// this takes long time. vary long time
    public static void main(String[] args) {
        int nums[] = new int[7];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 43) + 1;
        }

        long attempt = 0;
        Boolean jeckpot = false;
        while(jeckpot == false){
            attempt++;
            for(int i = 0; i < nums.length; ){
                int random = (int)(Math.random() * 43) + 1;
                if(random != nums[i]){
                    break;
                }

                i++;
                jeckpot = (i == nums.length) ? true : false;
            }
        }

        System.out.println(attempt);
    }
}
