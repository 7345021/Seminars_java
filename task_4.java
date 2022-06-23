//Задача №4. Написать программу, показывающую последовательность
//  действий для игры “Ханойская башня”

public class task_4 {
    public static void main(String[] args) {
        int count = 2;
        moveRing('A', 'B', 'C', count);
        // moveRing('source', 'buff', 'c', count);
    }

    public static void moveRing(char source, char destination, char buff, int count) {

    	if (count==1){
		    System.out.println(String.format("from %s to %s",source,destination));
	    }
        else {
		    // moveRing(a, c, b, count - 1);
            moveRing(source, buff, destination, count - 1);
		    System.out.println(String.format("from %s to %s",source,destination));
	        // moveRing(c,b,a,count-1);
            moveRing(buff,destination,source,count-1);
    	}

    }
}



	