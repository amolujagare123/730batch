public class TVshowroom {

    void channels()
    {
        System.out.println("TV showroom channels");
    }

    void volume()
    {
        System.out.println("TV show room volume");
    }

    void settings()
    {
        System.out.println("TV show room settings");
    }
}

class  Samsang extends  TVshowroom
{

    void channels()
    {
        System.out.println("Samsang channels");
    }

    void volume()
    {
        System.out.println("Samsang volume");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }

}

class LG extends  TVshowroom
{
    void channels()
    {
        System.out.println("LG channels");
    }

    void volume()
    {
        System.out.println("LG volume");
    }

    void settings()
    {
        System.out.println("LG settings");
    }

}

class Onida extends TVshowroom
{
    void channels()
    {
        System.out.println("Onida channels");
    }

    void volume()
    {
        System.out.println("Onida volume");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }


    public static void main(String[] args) {

         TVshowroom ob = new Samsang();

         ob.channels();
         ob.settings();
         ob.volume();


         ob = new LG();
        ob.channels();
        ob.settings();
        ob.volume();

        ob = new Onida();

        ob.channels();
        ob.settings();
        ob.volume();



    }
}