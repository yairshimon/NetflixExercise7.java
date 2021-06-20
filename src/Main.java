import java.util.Scanner;
public class Main {
    public static final int MAX_SERIES = 1000;
    public static final int MAX_ACCOUNTS = 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initial boot start until line 33.
        Episodes e1 = new Episodes("\"Pilot\"", 3,"Hannah swings and misses at two curves when her parents rescind their financial support and she loses her unpaid internship. Meanwhile, Hannah's roommate, Marnie, throws a dinner party for their nomadic friend Jessa, who's returned from yet another journey.","April 15, 2012");
        Episodes e2 = new Episodes("\"Vagina Panic\"", 3,"Hannah reveals her Forrest Gump-induced AIDS phobia when she realizes Adam might not be practicing monogamy. Marnie lives in denial of her boredom with her boyfriend Charlie; Jessa avoids Marnie's meticulously planned day at a women's health clinic.","April 22, 2012");
        Episodes e3 = new Episodes("\"All Adventurous Women Do\"", 3,"Hannah meets up with her erstwhile college flame to find out how she contracted HPV, uncovering much more in the process. Marnie's art-gallery boss introduces her to a cocky artist who piques her interest, while Jessa gets a baby-sitting gig.","April 29, 2012");
        Episodes e4 = new Episodes("\"Pilot\"", 3,"While on vacation Oliver Queen's ship is destroyed in a storm and he is the only survivor. He finds himself trapped on an island for the next five years. Once he makes it back to Starling City he is reunited with his family and his former girlfriend, but they are unaware that he has changed... and has put the skills he learned to survive on the island to become the vigilante that the city needs.","October 10, 2012");
        Episodes e5 = new Episodes("\"Honor Thy Father\"", 3,"A corrupt businessman, Martin Somers, hires a Chinese assassin named China White to eliminate Laurel for finding out too much. While protecting Laurel, Oliver is offered the chance to take back control of the company.","October 17, 2012");
        Episodes e6 = new Episodes("\"Lone Gunmen\"", 3,"Oliver learns that he is not the only person in Star City that is flying under the radar of the police. An assassin named Dead shot is targeting businessmen bidding on an energy project, and Walter is one of the men involved. Oliver has no choice but to turn to Detective Lance for help to protect his family while he taken on the killer.","October 24, 2012");
        Episodes e7 = new Episodes("\"Pilot\"", 3,"Barry Allen, a forensic crime scene assistant for Central City Police Department, is struck by lightning during a storm that is created after a particle accelerator from S.T.A.R. Labs explodes. In a coma for nine months, Barry awakens in S.T.A.R. Labs, having been placed in the care of its founder Harrison Wells and his assistants Dr. Caitlin Snow and Cisco Ramon","October 7, 2014");
        Episodes e8 = new Episodes("\"Fastest Man Alive\"", 3,"In flashbacks, it is revealed that Joe became Barry's legal guardian but did not let him visit Henry in prison at the latter's request. Barry begins using his abilities to stop minor crimes and help citizens across the city while starting to develop debilitating side effects. While guiding Iris West, who seeks his help to do her school assignment, Barry witnesses a robbery by a crew of men, but passes out while trying to stop them. ","October 14, 2014");
        Episodes e9 = new Episodes("\"Things You Can't Outrun\"", 3,"As the police investigate the murder of one of the city's crime families, Barry suspects that the killer may be a meta man who can control poison gases. As Barry and Joe work to discover the killer's identity, Wells and his team work to retrofit the particle accelerator into a prison for meta humans where they can begin to find a way of reversing their mutations.","October 21, 2014");
        Episodes[] episodesGirls = {e1,e2,e3};
        Episodes[] episodesArrow = {e4,e5,e6};
        Episodes[] episodesFlash = {e7,e8,e9};
        Series s1 = new Series("Girls", 3,episodesGirls);
        Series s2 = new Series("Arrow",3,episodesArrow);
        Series s3 = new Series("Flash", 3,episodesFlash);
        AllSeries allSeries = new AllSeries();
        allSeries.add(s1);
        allSeries.add(s2);
        allSeries.add(s3);
        allSeries.print();
        Accounts[] accounts = new Accounts[MAX_ACCOUNTS];
        int yourPress , emptyUser =1;
        for (int i = 0; i < accounts.length; i++) { // Boot accounts to avoid error.
            accounts[i] = new Accounts("null", "null", "null","null");
        }
        //Initial boot finish.
        boolean oneLetter = false, oneNumber = false, emptyAccount = true;
        int a;
        String nameAccountOwner;
        String password;
        while(true) {
            do { // "do" Avoid an error that the user enters a number different from 1 or 2.
                System.out.println("For open in account press 1.\nFor connection to old account press 2");
                yourPress = scanner.nextInt();
            } while ((yourPress != 1) && (yourPress != 2));
            if (yourPress == 1) {
                do {
                    a = 0;
                    System.out.println("Enter the name of the account holder ");
                    nameAccountOwner = scanner.next();
                    for (int i = 0; i < MAX_ACCOUNTS; i++) {
                        assert accounts[i] != null;
                        if ((accounts[i]).getNameAccountOwner().equals(nameAccountOwner)) {
                                System.out.println("name "  + nameAccountOwner + " is busy chose new name for account");
                                a = 1;
                                break;
                            }
                        }
                } while (a == 1);
                for (int i = 0; i < MAX_ACCOUNTS; i++) {
                    if (accounts[i].getNameAccountOwner().equals("null")) {
                        accounts[i].setNameAccountOwner(nameAccountOwner);
                        a = i;
                        break;
                    }
                }
                do {
                    System.out.println("Enter your password The password must be strong: at least 6 characters, at least one letter in English and at least one number ");
                    password = scanner.next();
                    for (int i = 0; i < password.length(); i++) {
                        if (password.charAt(i) > 64 && password.charAt(i) < 123){
                            oneLetter = true;
                        }
                        if (password.charAt(i) > 47 && password.charAt(i) < 58){
                            oneNumber = true;
                        }
                    }
                } while (!(oneLetter && oneNumber && password.length() == 6));
                accounts[a].setPassword(password);
            } else  { // if the user press 2.
             /*   for (Accounts account : accounts) { // Lines 79-85 To prevent error when not using the system.
                   if (account.getNameAccountOwner() != null) {
                       emptyAccount = false;
                       break;
                   }
                } */
                if (emptyAccount){
                    System.out.println("Enter the name of the account holder ");
                    nameAccountOwner = scanner.next();
                    System.out.println("Enter your password The password must be strong: at least 6 characters, at least one letter in English and at least one number ");
                    password = scanner.next();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getNameAccountOwner().equals(nameAccountOwner) && accounts[i].getPassword().equals(password)) {
                            emptyUser =0;
                            System.out.println("WELCOME SER \nPress : (1) View the list of all series, (2) View the list of series you started watching, (3) View subscription details, (4) Select the series to watch, (5) Log out.");
                            yourPress = scanner.nextInt();
                            switch (yourPress){
                                case 1:
                                    allSeries.print();
                                    break;
                                case 2:
                                    boolean empty = true;
                                    for (int J = 0; J < MAX_SERIES; J++) {
                                        if ((accounts[i].getSeriesWatch(i)) && !(allSeries.checkEmpty(i))){
                                            allSeries.print(i);
                                            empty = false;
                                        }
                                    }
                                    if(empty)
                                        System.out.println("You have not viewed series yet");
                                    break;
                                case 3:
                                    int watchedSeries = 0;
                                    int watchSeries = 0;
                                    System.out.println("Date the account was created: " + accounts[i].getAccountCreationDate());
                                    System.out.println("The end date of the subscription in the account: " + accounts[i].getDateTerminationAccount());
                                    for (int J = 0; J < MAX_SERIES; J++) {
                                        if (accounts[i].getSeriesWatched(i)){
                                            watchSeries++;
                                        }
                                    }
                                    for (int J = 0; J < MAX_SERIES; J++) {
                                        if (accounts[i].getSeriesWatch(i)){
                                            watchSeries++;
                                        }
                                    }
                                    System.out.println(watchSeries + " Series you started watching so far." + watchedSeries + " From the series you started and finished.");
                                    break;
                                case 4:
                                    String nameOfEpisodes;
                                    System.out.println("Enter the name of the series you would like to see");
                                    String nameOfSeries = scanner.next();
                                    int indexOfSeries = allSeries.searchSeries(nameOfSeries);
                                    if(indexOfSeries == -2){
                                        System.out.println("There is no such series on the site ");
                                    } else{
                                        for (int J = 0; J < MAX_SERIES; J++) {
                                            if (accounts[i].getSeriesWatched(indexOfSeries)){
                                                System.out.println("You've seen and finished this series before");
                                                break;
                                            }
                                            if (accounts[i].getSeriesWatch(indexOfSeries)){
                                                System.out.println("You've started seen this series before");
                                                break;
                                            }
                                        }

                                        allSeries.print(indexOfSeries);
                                        System.out.println("Select an episode you want to watch");
                                        nameOfEpisodes = scanner.next();
                                        accounts[i].addEpisodes(nameOfEpisodes);
                                    }
                                    break;
                                case 5:

                                    i=2000000;//To exit the loop to the main menu.
                                    break;
                                default:
                                    System.out.println("Choose a number from 1 to 5");
                                    i--;
                                    break;
                            }
                        }
                    }
                    if (emptyUser == 1)
                        System.out.println("No user with this information");
                }else
                    System.out.println("NO USERS IN SYSTEM");
                }
            }
        }
    }