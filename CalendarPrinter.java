public class CalendarPrinter
{
    public static void main (String[] args) {
        int x = 1;
        String y = "September ";
        while (x < 31)
        {
            if (x == 5 || x == 6 || x == 12 || x == 13 || x == 19 || x == 20 || x == 26 || x == 27)
            {
                System.out.println(y + x + " - WEEKEND");
            }
            else if (x == 7)
            {
                System.out.println(y + x + " - NO SCHOOL (LABOR DAY)");
            }
            else if (x == 25)
            {
                System.out.println(y + x + " - END OF THE MARKING PERIOD");
            }
            else
            {
                System.out.println(y + x);
            }
            x++;
        }
    }
}