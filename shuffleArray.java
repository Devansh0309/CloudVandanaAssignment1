import java.lang.Math;
import java.util.Arrays;

public class shuffleArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]=new int[]{1, 2, 3, 4, 5, 6, 7};
        double random1=Math.random();
        double random2=Math.random();
        
        int start=(int)Math.floor(arr.length*(random1<random2?random1:random2));
        int end=(int)Math.floor(arr.length*(random1>random2?random1:random2));

        int pickedPack[]=new int[end-start+1];
        for(int i=0;i<pickedPack.length;i++){
            pickedPack[i]=arr[i+start];
        }
        System.out.println(Arrays.toString(pickedPack));
        double pos=Math.random();
        boolean positionRight=true; //place picked pack of cards from start to end at the end of left pack.
        if(pos>=0.5){
            positionRight=true;
        }
        else{
            positionRight=false;
        }
        if(positionRight){
            for(int i=end+1;i<arr.length;i++){
                arr[i-end-1+start]=arr[i];
            }
            for(int i=arr.length-pickedPack.length;i<arr.length;i++){
                arr[i]=pickedPack[i-arr.length+pickedPack.length];
            }
        }
        else{
            for(int i=start-1;i>-1;i--){
                arr[i+end+1-start]=arr[i];
            }
            for(int i=0;i<pickedPack.length;i++){
                arr[i]=pickedPack[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}