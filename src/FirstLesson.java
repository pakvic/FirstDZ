public class FirstLesson {

    public static void main (String[] args){

        MathClass MathClass = new MathClass();
        MathClass.randomMass();
        int [] massSort = new int[]{5,6,3,2,5,1,4,9};
        SortMass SortMass = new SortMass();
        SortMass.sort(massSort);

    }

}
