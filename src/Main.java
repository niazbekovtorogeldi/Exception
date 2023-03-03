
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("вы должны водит свое имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();



        try {

            System.out.println("тепер ведите возраст,ваш возраст должен быть либо выше 14 ");
            int a = scanner.nextInt();
            if (a < 14) {
                throw new Exception("14 chon bolsun");

            }

                System.out.println("тепер ведите свой gmail он должен содержать символ @");
                String c1 = new Scanner(System.in).nextLine();


                if (!c1.contains("@")) {
                    throw new Exception(" у вас нету знака @");
                } else {
                    System.out.println("все правильно");
                }
            System.out.println("\nтеперь вы должны ввести пароль,он должен содержать 7 цифр");
               String pasword = new Scanner(System.in).nextLine();
                if (pasword.length()<7){

                    throw new Parolexception("жетиден коп болбош керек жана жетиден аз болбош керек");
                } System.out.println("вы успешно зарегистрировалис, " +
                    "теперь вы можете исползовать instagram ");


        } catch (Exception e) {
            System.out.println(e.getMessage());

        }catch (GmailException a) {
            System.out.println(a.getMessage());
        }catch (Parolexception d){
            System.out.println(d.getMessage());


                }
            }
        }

