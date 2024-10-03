import java.util.Scanner;
import java.io.File;
import java.time.LocalTime;

public class MyClass{
    public static void main(String[] args){
        File file = new File("hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
        System.out.println(" ");
        String camel = """
            Look at our camel
            
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;     
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
        
                """;
        System.out.println(camel);
        LocalTime currentTime = LocalTime.now();
        String Animal = "Camel";
        String time = "2:04 PM";
        double Temp = 59.66;
        System.out.println("Animal type: "+Animal);
        System.out.println("Current Time: "+formattedTime);
        System.out.println("Current Tempurature: "+Temp+" F");
    }
}