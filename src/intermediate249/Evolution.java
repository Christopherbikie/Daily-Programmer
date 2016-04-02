package intermediate249;

import java.util.Random;

public class Evolution {

	public char[] current, fittest, target;
	public int generation = 0, size;
	public double rate;
    private Random random = new Random();

	public static void main(String[] args) {
		Evolution helloWorld = new Evolution();
		
		helloWorld.evolve("I can do it", .1, 200);
	}

	public Evolution() {
		
	}
	
	public void evolve(String target, double rate, int size) {
	    this.rate = rate;
	    this.size = size;
	    
	    long startTime = System.currentTimeMillis();
	    
        int targetLength = target.length();
        current = new char[targetLength];
        for (int i = 0; i < targetLength; i++) {
            current[i] = (char) (32 + random.nextInt(95));
        }

        while (fitness(new String(current), target) > 0) {
        	System.out.printf("Generation: %d Fitness: %d Current: %s%n", generation++, fitness(new String(current), target), new String(current));
            fittest = current;
            for (int i = 0; i < this.size; i++) {
                String mutation = mutate(new String(current), random);
                if (fitness(mutation, target) <= fitness(new String(fittest), target)) {
                    fittest = mutation.toCharArray();
                }
            }
            current = fittest;
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.printf("Generation: %d Fitness: %d Current: %s Time taken: %dns", generation, fitness(new String(current), target), new String(current), duration);
    }

    private String mutate(String s1, Random random) {
        char[] newString = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            newString[i] = random.nextDouble() < rate ? (char) (32 + random.nextInt(95)) : s1.charAt(i);
        }
        return new String(newString);
    }

    private int fitness(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}