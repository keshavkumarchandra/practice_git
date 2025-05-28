public class array {
    public static void main(String[] args){
        int[] nums ={1,2,3,4,5,6};
        nums[1] = 10; // Change the second element to 10
        nums[5] =nums[5] +10;
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

