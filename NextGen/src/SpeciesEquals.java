public class SpeciesEquals
{
    private static Species s12;
	private static Object s22;

	public static void main(String[] args, Species s1, Object s2)
    {
        
      s1 = null;
      s2 = null;
      
        s12 = s1;
		s12.setSpecies("Klingon ox", 10, 15);
        s22 = s2;
		((Species) s22).setSpecies("Klingon ox", 10, 15);

        if (s12 == s22)
            System.out.println("Match with ==.");
        else
            System.out.println("Do Not match with ==.");

        if (s12.equals(s22))
            System.out.println("Match with the method equals.");
        else
            System.out.println("Do Not match with the method equals.");

        System.out.println("Now change one Klingon ox to lowercase.");
        ((Species) s22).setSpecies("klingon ox", 10, 15); //Use lowercase

        if (s12.equals(s22))
            System.out.println("Match with the method equals.");
        else
            System.out.println("Do Not match with the method equals.");
    }
}
