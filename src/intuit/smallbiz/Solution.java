package intuit.smallbiz;

//Level Options: `intern`, `swe1`, `swe2`
public class Solution {

    public static void main(String[] args) {

        /* Part 2 */
        Company cA = new Company("Grocery Store", "Address 1");
        Company cB = new Company("B", "Address B");
        Company cD = new Company("D", "Address D");
        Company cC = new Company("C" , "Address C");
        Company cE = new Company("E", "Address E");
        Company cF = new Company("F", "Address F");
        Company cG = new Company("G", "Address G");

        /* Create uni-directional relationship */
        cA.addRelation(cB);
        cB.addRelation(cC);
        cB.addRelation(cD);
        cD.addRelation(cE);
        cE.addRelation(cF);
        cF.addRelation(cG);

        /* Part 3 solution */
//        System.out.println(cA.getDegreeOfSeparation(cD));

//        System.out.println(cA.getDegreeOfSeparation(cE));
//        System.out.println(cA.getDegreeOfSeparation(cF));
        System.out.println(cA.getDegreeOfSeparation(cG));
//        System.out.println(cB.getDegreeOfSeparation(cG));
//        System.out.println(cE.getDegreeOfSeparation(cG));
//        System.out.println(cF.getDegreeOfSeparation(cG));

    }
}
