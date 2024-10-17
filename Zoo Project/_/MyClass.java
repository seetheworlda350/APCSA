import java.util.Scanner;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MyClass{
    public static void main(String[] args){

        System.out.println("Enter which animal you want to view (no upercase): ");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        if(animal.equals("camel")) {
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
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            int camTempMin = 60;
            int camTempMax = 125;
            int camTemp = (int) (Math.random() * (camTempMax - camTempMin + 1) + camTempMin);
            System.out.println("Animal type: " + Animal);
            System.out.println("Time accessed: " + dtf.format(now));
            System.out.println("Current Temperature: " + camTemp + " F");
        } else{
            if(animal.equals("rabbit")){
                String rabbit = """
                        Look at our rabbit
                        
                        (\\
                        (-.-)
                        o_(")(")
                        
                        """;
                System.out.println(rabbit);
                LocalTime currentTime = LocalTime.now();
                String Animal = "Rabbit";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                int rabTempMin = 30;
                int rabTempMax = 70;
                int rabTemp = (int) (Math.random() * (rabTempMax - rabTempMin + 1) + rabTempMin);
                System.out.println("Animal type: " + Animal);
                System.out.println("Time accessed: " + dtf.format(now));
                System.out.println("Current Temperature: " + rabTemp + " F");
            }
                }
            }
        }

