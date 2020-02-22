package by.carkva_gazeta.GrateCaliandar;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by oleg on 21.10.16
 */

@SuppressWarnings("MagicConstant")
class caliandar_year {

    private static String[][] svitya;
    private static int YearG;

    private static void getSviatyYear(int Year) {
        if (svitya == null || Year != YearG) {
            YearG = Year;
            String[][] cviatyG = new String[367][3];
            StringBuilder sb = new StringBuilder();
            try {
                File file = new File("/home/oleg/www/carkva/calendar-cytanne_" + Year + ".php");
                if (!file.exists()) {
                    Calendar calendar = Calendar.getInstance();
                    file = new File("/home/oleg/www/carkva/calendar-cytanne_" + calendar.get(Calendar.YEAR) + ".php");
                }
                InputStream inputStream = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(inputStream);
                BufferedReader reader = new BufferedReader(isr);
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                inputStream.close();
            } catch (IOException ignored) {
            }
            String[] res = sb.toString().split("\\$calendar\\[]=array\\(");
            for (int i = 1; i < res.length; i++) {
                String[] red = res[i].split("cytanne");
                int t1 = red[0].indexOf("=>\"");
                int t2 = red[0].indexOf("-->", t1 + 3);
                int t3 = red[0].indexOf("\"", t1 + 3);
                String cviaty;
                if (t2 != -1) {
                    cviaty = red[0].substring(t2 + 3, t3);
                } else {
                    cviaty = red[0].substring(t1 + 3, t3);
                }
                cviaty = cviaty.replace("<br>", " ");
                String cytanne = "";
                int v1 = red[1].indexOf("ahref.\"");
                if (v1 != -1) {
                    int v2 = red[1].indexOf("</a>", v1);
                    if (v2 != -1)
                        cytanne = red[1].substring(v1 + 7, v2).replace("<br>", "\n");
                    else
                        cytanne = red[1].substring(v1 + 7).replace("<br>", "\n");
                }
                String number = "";
                int s1 = red[0].indexOf("<!--");
                if (s1 != -1) {
                    int s2 = red[0].indexOf("-->", s1 + 4);
                    String pre_res = red[0].substring(s1 + 4, s2);
                    int s3 = pre_res.indexOf(" ");
                    if (s3 != -1) {
                        number = pre_res.substring(0, s3);
                    } else {
                        number = pre_res;
                    }
                }
                cviatyG[i - 1][0] = cviaty;
                cviatyG[i - 1][1] = cytanne;
                cviatyG[i - 1][2] = number;
            }
            svitya = cviatyG;
        }
    }

    static String getSviaty(int Year, int DayYaer, int f) {
        getSviatyYear(Year);
        return svitya[den(Year, DayYaer)][f];
    }

    static String[][] sviatyia(int Year) {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        String[][] sviatyia_new;
        if (gregorianCalendar.isLeapYear(Year)) sviatyia_new = new String[366][4];
        else sviatyia_new = new String[365][4];
        try {
            File file = new File("/home/oleg/www/carkva/calendarsviatyia.txt");
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);
            String line;
            int e = 0, e2 = 59;
            while ((line = reader.readLine()) != null) {
                String[] re1 = line.split("<>");
                if (gregorianCalendar.isLeapYear(Year)) {
                    for (int q = 0; q < re1.length; q++) {
                        if (q == 1)
                            // исправление чтения на 1 января
                            sviatyia_new[e][q] = re1[q].trim().replace("<br>", "\n");
                        else
                            sviatyia_new[e][q] = re1[q].trim();
                    }
                } else {
                    if (e == 59) {
                        e++;
                        continue;
                    }
                    if (e < 59) {
                        for (int q = 0; q < re1.length; q++) {
                            sviatyia_new[e][q] = re1[q].trim();
                        }
                    } else {
                        for (int q = 0; q < re1.length; q++) {
                            sviatyia_new[e2][q] = re1[q].trim();
                        }
                        e2++;
                    }
                }
                e++;
            }
            inputStream.close();
        } catch (Throwable ignored) {
        }
        return sviatyia_new;
    }

    private static int den(int Year, int DayYaer) {
        int data_p, month_p;
        int a = Year % 19;
        int b = Year % 4;
        int cx = Year % 7;
        int k = (Year / 100);
        int p = (13 + 8 * k) / 25;
        int q = (k / 4);
        int m = (15 - p + k - q) % 30;
        int n = (4 + k - q) % 7;
        int d = (19 * a + m) % 30;
        int ex = (2 * b + 4 * cx + 6 * d + n) % 7;
        if (d + ex <= 9) {
            data_p = d + ex + 22;
            month_p = 3;
        } else {
            data_p = d + ex - 9;
            if (d == 29 && ex == 6) data_p = 19;
            if (d == 28 && ex == 6) data_p = 18;
            month_p = 4;
        }
        GregorianCalendar pasha = new GregorianCalendar(Year, month_p - 1, data_p);
        int pashaDay = pasha.get(Calendar.DAY_OF_YEAR) - 1;
        int nachaloGoda = 365 - pashaDay;
        int tekusiyDen;
        if (DayYaer < pashaDay) tekusiyDen = nachaloGoda + DayYaer;
        else tekusiyDen = DayYaer - pashaDay;
        return tekusiyDen;
    }
}
