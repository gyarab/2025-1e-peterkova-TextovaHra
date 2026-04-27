package org.example;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("");
        System.out.println("Tato hra je horrorový gamebook, funguje na základě zadání vybraného rozhodnutí do terminálu, tedy zadání čísla odpovědi, kterou si hráč vybírá. Cílem");
        System.out.println("hry je dostat se domů.");
        System.out.println("1) Rozumím");
        System.out.println("2) Nerozumím");
        System.out.println("");

        int choice = 0;

        while (choice != 1) {
            System.out.print("Vyber možnost: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    break;
                } else if (choice == 2) {
                    System.out.println("");
                    System.out.println("Přečti si znovu text :)");
                } else {
                    System.out.println("Neplatná volba, zkus to znovu.");
                }
            } else {
                System.out.println("Zadej číslo!");
                scanner.next();
            }
        }

        Zacatek.Zacatek();

        choice = 0;

        while (choice != 1 && choice != 2) {
            System.out.print("Vyber možnost: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Neplatná volba! Zkus to znovu.");
                }
            } else {
                System.out.println("Zadej číslo!");
                scanner.next();
            }

            if (choice == 1) {
                System.out.println("");
                System.out.println("Sedíš opodál a koukáš z okna. V ulicích se míhají domy a parky osvětlené jen pár lampami. Po chvíli si ale všimneš, že se ten člověk k tobě přibližuje");
                System.out.println("");
                System.out.println("1) Konfrontuješ ho");
                System.out.println("2) Odsedneš si");
                System.out.println("");

                choice = 0;

                while (choice != 1 && choice != 2) {
                    System.out.print("Vyber možnost: ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2) {
                            System.out.println("Neplatná volba! Zkus to znovu.");
                        }
                    } else {
                        System.out.println("Zadej číslo!");
                        scanner.next();
                    }

                    if (choice == 1) {

                        System.out.println("");
                        System.out.println("Chvíli přemýšlíš, jestli je to dobrý nápad, ale pak se vzchopíš. Postavíš se před toho před tebou se sebevědomým výrazem ve tváři.");
                        System.out.println("'Máš snad nějaký problém?!', ohradíš se hlasitě. Člověk se ti podívá hluboko do očí ale neřekne nic. Pak se lehce pousměje a odvrátí pohled zpět k oknu. ");
                        System.out.println("Atmosféra v tramvaji ztěžkne a ty máš pocit, že jsi udělal něco špatně. Raději vystoupíš hned další zastávku, aby ses vyhnul dalšímu kontaktu. ");
                        System.out.println("Když ale vyjdeš ven, dojde ti, že žádná jiná tramvaj ten den už nepojede. Smůla že se ten den už domů nedostaneš.");
                        //konec - zvláštní atmosféra

                        Konec.spatnyKonec(scanner);

                    } else if (choice == 2) {

                        System.out.println("");
                        System.out.println("Odsedneš si trochu dál, a k tvému překvapení, na tebe ten člověk přestane zírat. Decentně se ti uleví. Koukáš opět z okna a přemýšlíš, jak dlouho");
                        System.out.println("tahle cesta bude ještě trvat. Mohl by sis jí možná nějak zkrátit...");
                        System.out.println("");
                        System.out.println("1) Podíváš se na film");
                        System.out.println("2) Začneš poslouchat hudbu");
                        System.out.println("");

                        choice = 0;

                        while (choice != 1 && choice != 2) {
                            System.out.print("Vyber možnost: ");
                            if (scanner.hasNextInt()) {
                                choice = scanner.nextInt();
                                if (choice != 1 && choice != 2) {
                                    System.out.println("Neplatná volba! Zkus to znovu.");
                                }
                            } else {
                                System.out.println("Zadej číslo!");
                                scanner.next();
                            }
                            if (choice == 1) {

                                System.out.println("");
                                System.out.println("Zapneš telefon a přemýšlíš. Jaký žánr by sis měl pustit?");
                                System.out.println("1) Horror");
                                System.out.println("2) Komedie");
                                System.out.println("");

                                choice = 0;

                                while (choice != 1 && choice != 2) {
                                    System.out.print("Vyber možnost: ");
                                    if (scanner.hasNextInt()) {
                                        choice = scanner.nextInt();
                                        if (choice != 1 && choice != 2) {
                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                        }
                                    } else {
                                        System.out.println("Zadej číslo!");
                                        scanner.next();
                                    }
                                    if (choice == 1) {

                                        System.out.println("Začneš sledovat horror. V jednu chvíli si všimneš, že zvuk ve filmu se začne zpožďovat oproti obrazu.");
                                        System.out.println("Najednou se na obrazovce objeví scéna, která odpovídá tomu, co se děje ve skutečnosti v tramvaji...");
                                        System.out.println("");
                                        System.out.println("1) Vypneš telefon");
                                        System.out.println("2) Ignoruješ to a pokračuješ ve sledování");

                                        choice = 0;

                                        while (choice != 1 && choice != 2) {
                                            System.out.print("Vyber možnost: ");
                                            if (scanner.hasNextInt()) {
                                                choice = scanner.nextInt();
                                                if (choice != 1 && choice != 2) {
                                                    System.out.println("Neplatná volba! Zkus to znovu.");
                                                }
                                            } else {
                                                System.out.println("Zadej číslo!");
                                                scanner.next();
                                            }
                                            if (choice == 1) {

                                                System.out.println("");
                                                System.out.println("Vypneš zařízení a frustrovaně vydechneš. Co to je sakra za den?! Už chceš být doma a dát si večeři či se nějak po celém náročném dni odreagovat.");
                                                System.out.println("Na mobilu ti ale vyskočí notifikace.");
                                                System.out.println("");
                                                System.out.println("1) Podíváš se na ni");
                                                System.out.println("2) Nepodíváš se na ni");
                                                System.out.println("");

                                                choice = 0;

                                                while (choice != 1 && choice != 2) {
                                                    System.out.print("Vyber možnost: ");
                                                    if (scanner.hasNextInt()) {
                                                        choice = scanner.nextInt();
                                                        if (choice != 1 && choice != 2) {
                                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                                        }
                                                    } else {
                                                        System.out.println("Zadej číslo!");
                                                        scanner.next();
                                                    }
                                                    if (choice == 1) {

                                                        System.out.println("");
                                                        System.out.println("Je to notifikace od tvé sestry. Chtěla by dnes u tebe přespat, protože se vrací z dlouhé cesty a bydlí daleko. Odepíšeš jí že může.");
                                                        System.out.println("Co přesně jí napíšeš?");
                                                        System.out.println("");
                                                        System.out.println("1) ");
                                                        System.out.println("2) ");
                                                        System.out.println("");


                                                    } else if (choice == 2) {

                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("1) ");
                                                        System.out.println("2) ");
                                                        System.out.println("");

                                                    }
                                                }

                                            } else if (choice == 2) {

                                                System.out.println("");
                                                System.out.println("Snažíš se nevnímat fakt, že scéna přesně odpovída tomu, jak to ve vozidle vypadá a pak... uvidíš na displeji sebe. Sebe, jak koukáš");
                                                System.out.println("dopředu na sedačku, na které sedí plyšová panenka. Správně by na ní ale měl sedět neznámý zvláštní člověk. Podíváš se před sebe a vidíš,");
                                                System.out.println("že před tebou sedí plyšová panenka. Jak se tam dostala? A kam zmizel ten neznámý?! Nedůvěřivě jí pozoruješ až se rozhodněš, že si jí prohlídneš.");
                                                System.out.println("V ruce držela papírek s nápisem. 'Jsi na řadě' vystřelíš pohledem nahoru od panenky. Tramvaj, ve které si jel se právě vybourala a museli tě převést");
                                                System.out.println("do nemocnice. Ten den ses tedy domů nedostal.");
                                                //konec panenka
                                                Konec.spatnyKonec(scanner);

                                            }
                                        }

                                    } else if (choice == 2) {

                                        System.out.println("Pustíš si komedii a začneš se usmívat. Po chvíli si všimneš, že se ten člověk taky usmívá, zatím co se dívá do svého telefonu.");
                                        System.out.println("Nevypadá už tak hrozivě... spíš tak zvláštně osaměle.");
                                        System.out.println("");
                                        System.out.println("1) Oslovíš ho");
                                        System.out.println("2) Ignoruješ ho dál");

                                        choice = 0;

                                        while (choice != 1 && choice != 2) {
                                            System.out.print("Vyber možnost: ");
                                            if (scanner.hasNextInt()) {
                                                choice = scanner.nextInt();
                                                if (choice != 1 && choice != 2) {
                                                    System.out.println("Neplatná volba! Zkus to znovu.");
                                                }
                                            } else {
                                                System.out.println("Zadej číslo!");
                                                scanner.next();
                                            }
                                            if (choice == 1) {

                                                System.out.println("");
                                                System.out.println("Opatrně ho oslovíš. Zvedne oči nahoru a podívá se na tebe. Chvíli na sebe mlčky koukáte, až do toho bodu, kdy si říkáš, jestli to byl dobrý nápad.");
                                                System.out.println("Pak na tebe promluví.");
                                                System.out.println("'Zvláštní, ne? Nemáš pocit, že už jsi něco takového zažil?' řekne. Ty nechápavě nakrčíš obočí. ");
                                                System.out.println("'Cože?'");
                                                System.out.println("'Ty si to nepamatuješ? Tohle už jsme zažili. Znovu a znovu...");
                                                System.out.println("Pak jakoby sis začal uvědomovat, že je ti to opravdu povědomé. Ta samota v tramvaji. Tento zvláštní člověk před tebou. Tento rozhovor...");
                                                System.out.println("'Smyčka se začne opět rozjíždět... Tak... a opět znovu...' najednou se ti zatemní před očima. Probereš se a sedíš na zastávce tramvaje. Z této smyčkyy není útěku.");
                                                System.out.println("");
                                                //konec - smyčka

                                                Konec.spatnyKonec(scanner);

                                            } else if (choice == 2) {

                                                System.out.println("");
                                                System.out.println("Jedeš tramvají dál a dál. Cesta od té chvíle působila velice klidně. Ani netušíš jak, ale dostal jsi se k zastávce blízko tvého domu. Vystoupíš, a...");
                                                System.out.println("");
                                                System.out.println("1) Půjdeš rovnou domů");
                                                System.out.println("2) Trochu se ještě projdeš");
                                                System.out.println("");

                                                choice = 0;

                                                while (choice != 1 && choice != 2) {
                                                    System.out.print("Vyber možnost: ");
                                                    if (scanner.hasNextInt()) {
                                                        choice = scanner.nextInt();
                                                        if (choice != 1 && choice != 2) {
                                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                                        }
                                                    } else {
                                                        System.out.println("Zadej číslo!");
                                                        scanner.next();
                                                    }
                                                    if (choice == 1) {

                                                        System.out.println("");
                                                        System.out.println("Jdeš noční ulicí a jseš nesmírně rád, že se blížíš ke svému bydlišti. Už jsi jen pár metrů od domova. Dojdeš, odemkneš dveře a vejdeš k sobě domů.");
                                                        Konec.dobryKonec(scanner);



                                                    } else if (choice == 2) {

                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("");
                                                        System.out.println("1) ");
                                                        System.out.println("2) ");
                                                        System.out.println("");

                                                    }
                                                }











                                            }
                                        }
                                    }
                                }
                            } else if (choice == 2) {

                                System.out.println("");
                                System.out.println("Odemkneš si telefon a namíříš prstem na ikonu Spotify. Nasadíš si sluchátka a vžíváš se do právě puštěné melodie. Najednou ale tramvaj zastaví.");
                                System.out.println("Nechápavě se rozhlídneš a čekáš, co se bude dít. Po chvilce příjde řidič a řekne, že vozidlo přestalo z neznámého důvodu fungovat. Musíš vystoupit.");
                                System.out.println("Máš ale špatný pocit, že tě člověk z tramvaje stále pronásleduje...");
                                System.out.println("");
                                System.out.println("1) Zachováš chladnou hlavu");
                                System.out.println("2) Začneš utíkat");
                                System.out.println("");

                                choice = 0;

                                while (choice != 1 && choice != 2) {
                                    System.out.print("Vyber možnost: ");
                                    if (scanner.hasNextInt()) {
                                        choice = scanner.nextInt();
                                        if (choice != 1 && choice != 2) {
                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                        }
                                    } else {
                                        System.out.println("Zadej číslo!");
                                        scanner.next();
                                    }
                                    if (choice == 1) {

                                        System.out.println("");
                                        System.out.println("Jsi docela ve stresu a doufáš že ten divný pocit co nejdříve přejde. V tu chvíli ale před sebou vidíš povědomou tvář.");
                                        System.out.println("'Babi?!'");
                                        System.out.println("Tvá babička tě uvídí a zářivě se na tebe usměje. Dáte se do řeči a pozve tě k ní domů na koláč a kávu. Toto nemůžeš odmítnout.");
                                        System.out.println("Domů jsi sice nedošel, ale alespoň jsi v bezpečí.");
                                        //konec - babička

                                        Konec.spatnyKonec(scanner);


                                    } else if (choice == 2) {

                                        System.out.println("");
                                        System.out.println("Začneš utíkat. Rychle. Do uší ti šumí vítr. A pak... uděláš krok mimo cestu. Jen na chvíli ztratíš orientaci. Když se rozhlédneš, ulice už nevypadá stejně.");
                                        System.out.println("Zastávky, které jsi znal, jsou pryč. Každá cesta, kterou zkusíš, tě vrací na stejné místo. A ty si uvědomíš, že nevíš, kudy domů.");
                                        //konec - ztracení
                                        Konec.spatnyKonec(scanner);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (choice == 2) {
                System.out.println("");
                System.out.println("Snažíš se přetrpět ty dlouhé tři minuty doufání v to, že tě neosloví. Tramvaj zastaví, dveře se otevřou, a ty vystoupíš na tmavé, neosvětlené zastávce. ");
                System.out.println("Nejezdí žádná auta a lampy už dávno nesvítí. Rozhodneš se přejít širokou ulici směrem k parku, co je cestou k tobě domů, stejně další tramvaj už nepojede.");
                System.out.println("");
                System.out.println("1) Obejdeš park");
                System.out.println("2) Projdeš park");
                System.out.println("");


                choice = 0;

                while (choice != 1 && choice != 2) {
                    System.out.print("Vyber možnost: ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice != 1 && choice != 2) {
                            System.out.println("Neplatná volba! Zkus to znovu.");
                        }
                    } else {
                        System.out.println("Zadej číslo!");
                        scanner.next();
                    }
                    if (choice == 1) {

                        System.out.println("");
                        System.out.println("Zabočíš nalevo od parku a koukáš na vzdálenější poblikávající lampu. Najednou ale vidíš, jak se pohne něco v křoví vedle tebe. A pak už cítíš");
                        System.out.println("jen těžký pocit temnoty co na tebe dopadá, a jak je tvé tělo bezvládně přitahováno gravitací k zemi. Probudíš se o několik dní později");
                        System.out.println("v nemocnici a vůbec nic si nepamatuješ. Jsi jako nový člověk.");
                        //konec - nemocnice
                        Konec.spatnyKonec(scanner);

                    } else if (choice == 2) {

                        System.out.println("");
                        System.out.println("Park takto v noci působí děsivě. Slyšíš praskání větviček a hučení nočních ptáků. Obezřetně se rozhlížíš po okolí,");
                        System.out.println("jak vstupuješ hloubš a hloubš do parku. Pak zamrkáš překvapením. Promneš si pro jistotu i oči. Sedí tam na lavičce ");
                        System.out.println("pár metrů od tebe to indiviuum z tramvaje?!");
                        System.out.println("");
                        System.out.println("1) Začneš se chovat jako blázen");
                        System.out.println("2) Otočíš se a odejdeš z parku");
                        System.out.println("");

                        choice = 0;

                        while (choice != 1 && choice != 2) {
                            System.out.print("Vyber možnost: ");
                            if (scanner.hasNextInt()) {
                                choice = scanner.nextInt();
                                if (choice != 1 && choice != 2) {
                                    System.out.println("Neplatná volba! Zkus to znovu.");
                                }
                            } else {
                                System.out.println("Zadej číslo!");
                                scanner.next();
                            }
                            if (choice == 1) {

                                System.out.println("");
                                System.out.println("Abys odradil člověka od případné interakce, začneš vydávat prapodivné zvuky a poskakovat okolo. On na tebe začne vyjeveně koukat. ");
                                System.out.println("Jdeš, tedy spíš se pohybuješ po cestě, co tedy vede okolo něj. Tímto stylem ho mineš a říkáš si že jsi vyhrál a už budeš v pořádku. ");
                                System.out.println("To by se ale nesměla za tebou ozvat věta, 'Jste v pořádku?'. Zmateně se obrátíš. Jaká bude tvá reakce?");
                                System.out.println("");
                                System.out.println("1) Odpovíš, že jsi v pořádku");
                                System.out.println("2) Ignoruješ ho a odejdeš");
                                System.out.println("");

                                choice = 0;

                                while (choice != 1 && choice != 2) {
                                    System.out.print("Vyber možnost: ");
                                    if (scanner.hasNextInt()) {
                                        choice = scanner.nextInt();
                                        if (choice != 1 && choice != 2) {
                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                        }
                                    } else {
                                        System.out.println("Zadej číslo!");
                                        scanner.next();
                                    }
                                    if (choice == 1) {

                                        System.out.println("");
                                        System.out.println("Ohlédneš se za sebe a člověk se na tebe s divným úsměvem podívá. 'Ne na dlouho' pronese tiše. Zamrkáš, ale jakmile otevřeš oči, osoba před tebou není. Jako");
                                        System.out.println("by se ti jen zdála. Chvíli jen koukáš na to místo kde před chvílí stál a pak se rozhodneš radši odejít. Vezmeš to skrz park. Lampy za tebou mizí a jak je ticho");
                                        System.out.println("a tma, nejsi si vůbec jistý kudy jdeš. Až najednou ani nevíš jak dlouho tu jsi a proč. Domů jsi se nedostal.");
                                        //konec - ne na dlouho
                                        Konec.spatnyKonec(scanner);


                                    } else if (choice == 2) {

                                        System.out.println("");
                                        System.out.println("Neznámý na tebe jen krátce pohlédne a pak otočí zrak pryč. Chvíli váháš, ale rozhodneš se ho ignorovat a pokračovat jiným směrem. Najdeš z parku cestu ven a ");
                                        System.out.println("vydáš se raději skrz jiné ulice, než kterými jsi sem došel. Cestou narazíš na malou večerku, kde si na chvíli sedneš a uklidníš se. Čas rychle uteče a venku už je půlnoc.");
                                        System.out.println("Dnešní cesta se tím pádem nevydařila, neboť jsi se nedostal domů.");
                                        //konec - vecerka
                                        Konec.spatnyKonec(scanner);
                                    }
                                }

                            } else if (choice == 2) {

                                System.out.println("");
                                System.out.println("Udělal jsi prudký pohyb a otočil ses zpět k zastávce. Vidíš že akorát přijíždí nějaká tramvaj. Snažíš se jí doběhnout, Jak ti jen síly stačí. Bohužel, jsi jí nestihl.");
                                System.out.println("Další dneska už nepojede, tím pádem nemáš způsob, jakým se dostat domů.");

                                //konec - zavřená tramvaj
                                Konec.spatnyKonec(scanner);

                            }
                        }
                    }
                }
            }
        }
    }
}






/*
choice = 0;

                                while (choice != 1 && choice != 2) {
                                    System.out.print("Vyber možnost: ");
                                    if (scanner.hasNextInt()) {
                                        choice = scanner.nextInt();
                                        if (choice != 1 && choice != 2) {
                                            System.out.println("Neplatná volba! Zkus to znovu.");
                                        }
                                    } else {
                                        System.out.println("Zadej číslo!");
                                        scanner.next();
                                    }
                                    if (choice == 1) {

                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("1) ");
                                        System.out.println("2) ");
                                        System.out.println("");




                                    } else if (choice == 2) {

                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("1) ");
                                        System.out.println("2) ");
                                        System.out.println("");

                                    }
                                }

 */