package java_oop_3_boxes_with_return_method_in_box_class;

public class main_file
{
    public static void main(String[] args)
    {
        box ourbox1;
        box ourbox2;
        box ourbox3;

            ourbox1 = new box();
            ourbox2 = new box();
            ourbox3 = new box();

                ourbox1.length = 10;
                ourbox1.height = 20;
                ourbox1.witdh  = 30;

                ourbox2.length = 10;
                ourbox2.height = 29;
                ourbox2.witdh  = 39;

                ourbox3.length = 10;
                ourbox3.height = 27;
                ourbox3.witdh  = 37;

                    int volume1 = ourbox1.volume();
                    int volume2 = ourbox2.volume();
                    int volume3 = ourbox3.volume();

                        System.out.println(volume1);
                        System.out.println(volume2);
                        System.out.println(volume3);
    }
}