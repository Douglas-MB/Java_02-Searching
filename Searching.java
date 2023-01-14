import java.util.Arrays;

public class Searching {

    int arraySize = MyTools.rng(20)+1;
    int[] array =  new int[arraySize];
    int value;


    public int binarySearch(){
        saveValues();
        searchedValue();

        System.out.print(Arrays.toString(array));
        System.out.println();

        int begin = 0;
        int end  =  arraySize-1;
        int mid=((begin + end)/2);
        int beginCnt = 0;
        int endCnt = 0;

        System.out.println("size  "+arraySize);
        System.out.println("searched\t"+value);
        System.out.println("old mid\t"+array[mid] +" index "+ mid);
        System.out.println();

        while(begin<=end){
            mid = ((begin + end)/2);

            if(array[mid]==value){
                return mid;
            }
            else if(array[mid]!=value){

                if(array[mid]>value){
                    endCnt++;
                    end = mid - 1;
                }
                else {
                    beginCnt++;
                    begin =  mid +1;
                }
            }
            System.out.println("value equals mid\t"+array[mid]+"  index "+mid);
            System.out.println("beginCnt:  "+beginCnt+"  endCnt:  "+endCnt);
            System.out.println();
        }

        System.out.println("NOT FOUND IT");
        return 0;
    }

    public int sentinelLinearSearch(){
        arraySize = MyTools.rng(99);
        array = new int[arraySize];

        saveValues();
        searchedValue();

        array[0] = value;
        int i=0;
        System.out.println("size "+array.length);
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println("sentinel "+value);

        int aux = array.length - 1;
        while(array[i]!=value){
            i++;
            aux++;

        }
        System.out.println("--> "+aux);

        if (i < arraySize || array[array.length] == value  ){
            System.out.println(i+" "+value);
            return i;
        }else{
            System.out.println("NOT FOUND");
            return -1;
        }

    }

    public int betterLinearSearch(){
        arraySize = MyTools.rng(99);
        array = new int[arraySize];

        saveValues();
        searchedValue();
        printArray();
        System.out.println(value);
        for (int i = 0; i < arraySize; i++) {
            if(array[i]==value){
                System.out.println("index:  "+i+ "\t" + "value:  "+value+"\n");

                return i;
            }
        }

        return 0;
    }
    public int linearSearch(){
        arraySize = MyTools.rng(999);
        array = new int[arraySize];
        int answer=-1;

        saveValues();
        searchedValue();
        printArray();

        for (int i = 0; i < arraySize; i++) {
            if(array[i]==value){
                answer = i;
            }
        }
        System.out.printf("index:  %d%value:  %d%n", answer, value);
    return answer;
    }

    public void searchedValue(){
         value = MyTools.rng(10);

    }
    public void saveValues(){
        for (int i = 0; i < arraySize; i++) {
            array[i] = MyTools.rng(20);
        }
    }

    public void printArray(){
        for (int i = 0; i < arraySize; i++) {
            System.out.printf(" %d ", array[i]);
        }
        System.out.println();
    }
}
