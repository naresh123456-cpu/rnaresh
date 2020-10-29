
 class Movies {
	
	String movieName;
	float duration;
	boolean multistarer;
    String hero;
    int collection;


	Movies(String movieName,float duration,boolean multistarer,String hero,int collection)
	{
		this.movieName=movieName;
		this.duration=duration;
		this.multistarer=multistarer;
		this.hero=hero;
		this.collection=collection;
	}
	void display() {
		System.out.println("movieName="+movieName);
		System.out.println("duration="+duration);
		System.out.println("multistarer="+multistarer);
		System.out.println("hero name="+hero);
		System.out.println("collecton for movie="+collection);
		
		
		System.out.println("movieName="+movieName);
		System.out.println("duration="+duration);
		System.out.println("multistarer="+multistarer);
		System.out.println("hero name="+hero);
		System.out.println("collecton for movie="+collection);
	}
}
class Movie
{
	public static void main(String[] args)
	{
		Movies firstMovie=new Movies("legend",2.4f,true,"balayya",15);
		firstMovie.display();
		
		Movies secondMovie=new Movies("kobbarimatta",2.7f,false,"sampu",10);
		secondMovie. display();
		
		
	}
}
	

