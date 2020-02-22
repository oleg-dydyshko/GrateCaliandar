package by.carkva_gazeta.GrateCaliandar;

import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

@SuppressWarnings("MagicConstant")
class chtenia {

    private int pascha_date(int year) {
        int data_p;
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int k = year / 100;
        int p = ((13 + 8 * k) / 25);
        int q = k / 4;
        int m = (15 - p + k - q) % 30;
        int n = (4 + k - q) % 7;
        int d = (19 * a + m) % 30;
        int e = (2 * b + 4 * c + 6 * d + n) % 7;
        if (d + e <= 9) {
            data_p = d + e + 22;
        } else {
            data_p = d + e - 9;
            if (d == 29 && e == 6) data_p = 19;
            if (d == 28 && e == 6) data_p = 18;
        }
        return data_p;
    }

    private int pascha_month(int year) {
        int month_p;
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int k = year / 100;
        int p = ((13 + 8 * k) / 25);
        int q = k / 4;
        int m = (15 - p + k - q) % 30;
        int n = (4 + k - q) % 7;
        int d = (19 * a + m) % 30;
        int e = (2 * b + 4 * c + 6 * d + n) % 7;
        if (d + e <= 9) {
            month_p = 2;
        } else {
            month_p = 3;
        }
        return month_p;
    }

    private String chteniaNedelnya(int NomerNedeli, int i) {
        NomerNedeli = NomerNedeli - 1;
        String[][] cviaty = new String[50][3];
        cviaty[0][0] = "УВАСКРАСЕНЬНЕ ГОСПАДА НАШАГА ІСУСА ХРЫСТА (Вялікдзень)";
        cviaty[0][1] = "На вячэрні: Ян 20.19-25;<br>Тон 1.<br>Дз 1.1-8; Ян 1.1-17";
        cviaty[0][2] = "1";
        cviaty[1][0] = "Нядзеля Тамаша (Антыпасха)";
        cviaty[1][1] = "Тон 1. На ютрані: Мц 28.16-20;<br>Дз 5.12-20; Ян 20.19-31";
        cviaty[1][2] = "3";
        cviaty[2][0] = "Нядзеля міраносіцаў";
        cviaty[2][1] = "Тон 2. На ютрані: Мк 16.9-20;<br>Дз 6.1-7; Мк 15.43-16.8";
        cviaty[2][2] = "3";
        cviaty[3][0] = "Нядзеля расслабленага";
        cviaty[3][1] = "Тон 3. На ютрані: Лк 24.1-12;<br>Дз 9.32-42; Ян 5.1-15";
        cviaty[3][2] = "3";
        cviaty[4][0] = "Нядзеля самаранкі";
        cviaty[4][1] = "Тон 4. На ютрані: Ян 20.1-10;<br>Дз 11.19-26, 29-30; Ян 4.5-42";
        cviaty[4][2] = "3";
        cviaty[5][0] = "Нядзеля сьлепанароджанага";
        cviaty[5][1] = "Тон 5. На ютрані: Ян 20.11-18;<br>Дз 16.16-34; Ян 9.1-38";
        cviaty[5][2] = "3";
        cviaty[6][0] = "Нядзеля сьвятых Айцоў I Усяленскага Сабору";
        cviaty[6][1] = "Тон 6. На ютрані: Ян 21.1-14;<br>Дз 20.16-18, 28-36; Ян 17.1-13";
        cviaty[6][2] = "3";
        cviaty[7][0] = "ЗЫХОД СЬВЯТОГА ДУХА (ТРОЙЦА)";
        cviaty[7][1] = "Тон 7. На ютрані: Ян 20.19-23;<br>Дз 2.1-11; Ян 7.37-52, 8.12";
        cviaty[7][2] = "1";
        cviaty[8][0] = "Нядзеля ўсіх сьвятых";
        cviaty[8][1] = "Тон 8. На ютрані: Мц 28.16-20;<br>Габ 11.33-12.2; Мц 10.32-33, 37-38, 19.27-30";
        cviaty[8][2] = "3";
        cviaty[9][0] = "Нядзеля ўсіх сьвятых беларускага народу";
        cviaty[9][1] = "Тон 1. На ютрані: Мк 16.1-8;<br>Рым 2.10-16; Мц 4.18-23";
        cviaty[9][2] = "3";
        cviaty[10][0] = "Нядзеля 3-я";
        cviaty[10][1] = "Тон 2. На ютрані: Мк 16.9-20;<br>Рым 5.1-10; Мц 6.22-33";
        cviaty[10][2] = "3";
        cviaty[11][0] = "Нядзеля 4-я";
        cviaty[11][1] = "Тон 3. На ютрані: Лк 24.1-12;<br>Рым 6.18-23; Мц 8.5-13";
        cviaty[11][2] = "3";
        cviaty[12][0] = "Нядзеля 5-я";
        cviaty[12][1] = "Тон 4. На ютрані: Лк 24.12-35;<br>Рым 10.1-10; Мц 8.28-9.1";
        cviaty[12][2] = "3";
        cviaty[13][0] = "Нядзеля 6-я";
        cviaty[13][1] = "Тон 5. На ютрані: Лк 24.36-53;<br>Рым 12.6-14; Мц 9.1-8";
        cviaty[13][2] = "3";
        cviaty[14][0] = "Нядзеля 7-я";
        cviaty[14][1] = "Тон 6. На ютрані: Ян 20.1-10;<br>Рым 15.1-7; Мц 9.27-35";
        cviaty[14][2] = "3";
        cviaty[15][0] = "Нядзеля 8-я";
        cviaty[15][1] = "Тон 7. На ютрані: Ян 20.11-18;<br>1 Кар 1.10-18; Мц 14.14-22";
        cviaty[15][2] = "3";
        cviaty[16][0] = "Нядзеля 9-я";
        cviaty[16][1] = "Тон 8. На ютрані: Ян 20.19-31;<br>1 Кар 3.9-17; Мц 14.22-34";
        cviaty[16][2] = "3";
        cviaty[17][0] = "Нядзеля 10-я";
        cviaty[17][1] = "Тон 1. На ютрані: Ян 21.1-14;<br>1 Кар 4.9-16; Мц 17.14-23";
        cviaty[17][2] = "3";
        cviaty[18][0] = "Нядзеля 11-я";
        cviaty[18][1] = "Тон 2. На ютрані: Ян 21.15-25;<br>1 Кар 9.2-12; Мц 18.23-35";
        cviaty[18][2] = "3";
        cviaty[19][0] = "Нядзеля 12-я";
        cviaty[19][1] = "Тон 3. На ютрані: Мц 28.16-20;<br>1 Кар 15.1-11; Мц 19.16-26";
        cviaty[19][2] = "3";
        cviaty[20][0] = "Нядзеля 13-я";
        cviaty[20][1] = "Тон 4. На ютрані: Мк 16.1-8;<br>1 Кар 16.13-24; Мц 21.33-42";
        cviaty[20][2] = "3";
        cviaty[21][0] = "Нядзеля 14-я";
        cviaty[21][1] = "Тон 5. На ютрані: Мк 16.9-20;<br>2 Кар 1.21-2.4; Мц 22.1-14";
        cviaty[21][2] = "3";
        cviaty[22][0] = "Нядзеля 15-я";
        cviaty[22][1] = "Тон 6. На ютрані: Лк 24.1-12;<br>2 Кар 4.6-15; Мц 22.35-46";
        cviaty[22][2] = "3";
        cviaty[23][0] = "Нядзеля 16-я";
        cviaty[23][1] = "Тон 7. На ютрані: Лк 24.12-35;<br>2 Кар 6.1-10; Мц 25.14-30";
        cviaty[23][2] = "3";
        cviaty[24][0] = "Нядзеля 17-я";
        cviaty[24][1] = "Тон 8. На ютрані: Лк 24.36-53;<br>2 Кар 6.16-7.1; Мц 15.21-28";
        cviaty[24][2] = "3";
        cviaty[25][0] = "Нядзеля 18-я";
        cviaty[25][1] = "Тон 1. На ютрані: Ян 20.1-10;<br>2 Кар 9.6-11; Лк 5.1-11";
        cviaty[25][2] = "3";
        cviaty[26][0] = "Нядзеля 19-я";
        cviaty[26][1] = "Тон 2. На ютрані: Ян 20.11-18;<br>2 Кар 11.31-12.9; Лк 6.31-36";
        cviaty[26][2] = "3";
        cviaty[27][0] = "Нядзеля 20-я";
        cviaty[27][1] = "Тон 3. На ютрані: Ян 20.19-31;<br>Гал 1.11-19; Лк 7.11-16";
        cviaty[27][2] = "3";
        cviaty[28][0] = "Нядзеля 21-я";
        cviaty[28][1] = "Тон 4. На ютрані: Ян 21.1-14;<br>Гал 2.16-20; Лк 8.5-15";
        cviaty[28][2] = "3";
        cviaty[29][0] = "Нядзеля 22-я";
        cviaty[29][1] = "Тон 5. На ютрані: Ян 21.15-25;<br>Гал 6.11-18; Лк 16.19-31";
        cviaty[29][2] = "3";
        cviaty[30][0] = "Нядзеля 23-я";
        cviaty[30][1] = "Тон 6. На ютрані: Мц 28.16-20;<br>Эф 2.4-10; Лк 8.26-39";
        cviaty[30][2] = "3";
        cviaty[31][0] = "Нядзеля 24-я";
        cviaty[31][1] = "Тон 7. На ютрані: Мк 16.1-8;<br>Эф 2.14-22; Лк 8.41-56";
        cviaty[31][2] = "3";
        cviaty[32][0] = "Нядзеля 25-я";
        cviaty[32][1] = "Тон 8. На ютрані: Мк 16.9-20;<br>Эф 4.1-6; Лк 10.25-37";
        cviaty[32][2] = "3";
        cviaty[33][0] = "Нядзеля 26-я";
        cviaty[33][1] = "Тон 1. На ютрані: Лк 24.1-12;<br>Эф 5.9-19; Лк 12.16-21";
        cviaty[33][2] = "3";
        cviaty[34][0] = "Нядзеля 27-я";
        cviaty[34][1] = "Тон 2. На ютрані: Лк 24.12-35;<br>Эф 6.10-17; Лк 13.10-17";
        cviaty[34][2] = "3";
        cviaty[35][0] = "Нядзеля 28-я";
        cviaty[35][1] = "Тон 3. На ютрані: Лк 24.36-53;<br>Кал 1.12-18; Лк 14.16-24";
        cviaty[35][2] = "3";
        cviaty[36][0] = "Нядзеля 29-я";
        cviaty[36][1] = "Тон 4. На ютрані: Ян 20.1-10;<br>Кал 3.4-11; Лк 17.12-19";
        cviaty[36][2] = "3";
        cviaty[37][0] = "Нядзеля 30-я";
        cviaty[37][1] = "Тон 5. На ютрані: Ян 20.11-18;<br>Кал 3.12-16; Лк 18.18-27";
        cviaty[37][2] = "3";
        cviaty[38][0] = "Нядзеля 31-я";
        cviaty[38][1] = "Тон 6. На ютрані: Ян 20.19-31;<br>1 Цім 1.15-17; Лк 18.35-43";
        cviaty[38][2] = "3";
        cviaty[39][0] = "Нядзеля 32-я";
        cviaty[39][1] = "Тон 7. На ютрані: Ян 21.1-14;<br>1 Цім 4.9-15; Лк 19.1-10";
        cviaty[39][2] = "3";
        cviaty[40][0] = "Нядзеля мытніка і фарысея";
        cviaty[40][1] = "Тон 1. На ютрані: Мц 28.16-20;<br>2 Цім 3.10-15; Лк 18.10-14";
        cviaty[40][2] = "3";
        cviaty[41][0] = "Нядзеля блуднага сына";
        cviaty[41][1] = "Тон 2. На ютрані: Мк 16.1-8;<br>1 Кар 6.12-20; Лк 15.11-32";
        cviaty[41][2] = "3";
        cviaty[42][0] = "Нядзеля мясапусная, пра страшны суд";
        cviaty[42][1] = "Тон 3. На ютрані: Мк 16.9-20;<br>1 Кар 8.8-9.2; Мц 25.31-46";
        cviaty[42][2] = "3";
        cviaty[43][0] = "Сырапусная нядзеля (Нядзеля прабачэньня)";
        cviaty[43][1] = "Тон 4. На ютрані: Лк 24.1-12;<br>Рым 13.11-14.4; Мц 6.14-21";
        cviaty[43][2] = "3";
        cviaty[44][0] = "Нядзеля праваслаўя";
        cviaty[44][1] = "Тон 5. На ютрані: Лк 24.12-35;<br>Літургія сьв. Васіля Вялікага<br>Габ 11.24-26, 11.32-12.2; Ян 1.43-51";
        cviaty[44][2] = "3";
        cviaty[45][0] = "2-я Нядзеля Вялікага посту";
        cviaty[45][1] = "Тон 6. На ютрані: Лк 24.36-53;<br>Літургія сьв. Васіля Вялікага<br>Габ 1.10-2.3; Мк 2.1-12";
        cviaty[45][2] = "3";
        cviaty[46][0] = "Нядзеля крыжапаклонная";
        cviaty[46][1] = "Тон 7. На ютрані: Ян 20.1-10;<br>Літургія сьв. Васіля Вялікага<br>Габ 4.14-5.6; Мк 8.34-9.1";
        cviaty[46][2] = "3";
        cviaty[47][0] = "4-я Нядзеля Вялікага посту";
        cviaty[47][1] = "Тон 8. На ютрані: Ян 20.11-18;<br>Літургія сьв. Васіля Вялікага<br>Габ 6.13-20; Мк 9.17-31";
        cviaty[47][2] = "3";
        cviaty[48][0] = "5-я Нядзеля Вялікага посту";
        cviaty[48][1] = "Тон 1. На ютрані: Ян 20.19-31;<br>Літургія сьв. Васіля Вялікага<br>Габ 9.11-14; Мк 10.32-45";
        cviaty[48][2] = "3";
        cviaty[49][0] = "УВАХОД У ЕРУСАЛІМ ГОСПАДА НАШАГА ІСУСА ХРЫСТА (Вербніца)";
        cviaty[49][1] = "На ютрані: Мц 21.1-11, 15-17;<br>Літургія сьв. Яна Залатавуснага<br>Флп 4.4-9; Ян 12.1-18<br>Блаславеньне вербаў";
        cviaty[49][2] = "1";
        return cviaty[NomerNedeli][i];
    }

    private String Sadmica1(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][0] = "Сьветлы панядзелак";
        cviaty[0][1] = "Тон 2.<br>Дз 1.12-17, 21-26; Ян 1.18-28";
        cviaty[0][2] = "5";
        cviaty[1][0] = "Сьветлы аўторак";
        cviaty[1][1] = "Тон 3.<br>Дз 2.14-21; Лк 24.12-35";
        cviaty[1][2] = "5";
        cviaty[2][0] = "Сьветлая серада";
        cviaty[2][1] = "Тон 4.<br>Дз 2.22-36; Ян 1.35-51";
        cviaty[2][2] = "5";
        cviaty[3][0] = "Сьветлы чацьвер";
        cviaty[3][1] = "Тон 5.<br> Дз 2.38-43; Ян 3.1-15";
        cviaty[3][2] = "5";
        cviaty[4][0] = "Сьветлая пятніца";
        cviaty[4][1] = "Тон 6.<br>Дз 3.1-8; Ян 2.12-22";
        cviaty[4][2] = "5";
        cviaty[5][0] = "Сьветлая субота";
        cviaty[5][1] = "Тон 7.<br>Дз 3.11-16; Ян 3.22-33";
        cviaty[5][2] = "5";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica2(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 3.19-26; Ян 2.1-11";
        cviaty[1][1] = "Дз 4.1-10; Ян 3.16-21";
        cviaty[2][1] = "Дз 4.13-22; Ян 5.17-24";
        cviaty[3][1] = "Дз 4.23-31; Ян 5.24-30";
        cviaty[4][1] = "Дз 5.1-11; Ян 5.30-6.2";
        cviaty[5][1] = "Дз 5.21-33; Ян 6.14-27";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica3(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 6.8-7.5, 7.47-60; Ян 4.46-54";
        cviaty[1][1] = "Дз 8.5-17; Ян 6.27-33";
        cviaty[2][1] = "Дз 8.18-25; Ян 6.35-39";
        cviaty[3][1] = "Дз 8-26-39; Ян 6.40-44";
        cviaty[4][1] = "Дз 8.40-9.19; Ян 6.48-54";
        cviaty[5][1] = "Дз 9.20-31; Ян 15.17-16.2";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica4(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 10.1-16; Ян 6.56-69";
        cviaty[1][1] = "Дз 10.21-33; Ян 7.1-13";
        cviaty[2][0] = "Палова сьвята Вялікадня";
        cviaty[2][1] = "Дз 14.6-18; Ян 7.14-30";
        cviaty[2][2] = "4";
        cviaty[3][1] = "Дз 10.34-43; Ян 8.12-20";
        cviaty[4][1] = "Дз 10.44-11.10; Ян 8.21-30";
        cviaty[5][1] = "Дз 12.1-11; Ян 8.31-42";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica5(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 12.12-17; Ян 8.42-51";
        cviaty[1][1] = "Дз 12.25-13.12; Ян 8.51-59";
        cviaty[2][1] = "Дз 13.13-24; Ян 6.5-14";
        cviaty[3][1] = "Дз 14.20-27; Ян 9.39-10.9";
        cviaty[4][1] = "Дз 15.5-34; Ян 10.17-28";
        cviaty[5][1] = "Дз 15.35-41; Ян 10.27-38";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica6(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 17.1-15; Ян 11.47-57";
        cviaty[1][1] = "Дз 17.19-28; Ян 12.19-36";
        cviaty[2][1] = "Дз 18.22-28; Ян 12.36-47";
        cviaty[3][0] = "УЗЬНЯСЕНЬНЕ ГОСПАДА НАШАГА ІСУСА ХРЫСТА (Ушэсьце)";
        cviaty[3][1] = "На ютрані: Мк 16.9-20;<br>Дз 1.1-12; Лк 24.36-53";
        cviaty[3][2] = "1";
        cviaty[4][1] = "Дз 19.1-8; Ян 14.1-11";
        cviaty[5][1] = "Дз 20.7-12; Ян 14.10-21";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica7(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Дз 21.8-14; Ян 14.27-15.7";
        cviaty[1][1] = "Дз 21.26-32; Ян 16.2-13";
        cviaty[2][1] = "Дз 23.1-11; Ян 16.15-23";
        cviaty[3][1] = "Дз 25.13-19; Ян 16.23-33";
        cviaty[4][1] = "Дз 27.1-44; Ян 17.18-26";
        cviaty[5][1] = "Дз 28.1-31; Ян 21.15-25";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica8(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][0] = "ДЗЕНЬ СЬВЯТОГА ДУХА";
        cviaty[0][1] = "Эф 5.9-19; Ян 18.10-20";
        cviaty[0][2] = "1";
        cviaty[1][1] = "Рым 1.1-7, 13-17; Мц 4.25-5.13";
        cviaty[2][1] = "Рым 1.18-27; Мц 5.20-26";
        cviaty[3][1] = "Рым 1.28-2.9; Мц 5.27-32";
        cviaty[4][1] = "Рым 2.14-29; Мц 5.33-41";
        cviaty[5][1] = "Рым 1.7-12; Мц 5.42-48";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica9(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][0] = "Пачатак Пятровага посту";
        cviaty[0][1] = "Рым 2.28-3.18; Мц 6.31-34, 7.9-11";
        cviaty[0][2] = "4";
        cviaty[1][1] = "Рым 4.4-12; Мц 7.15-21";
        cviaty[2][1] = "Рым 4.13-25; Мц 7.21-23";
        cviaty[3][1] = "Рым 5.10-16; Мц 8.23-27";
        cviaty[4][1] = "Рым 5.17-6.2; Мц 9.14-17";
        cviaty[5][1] = "Рым 3.19-26; Мц 7.1-8";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica10(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Рым 7.1-13; Мц 9.36-10.8";
        cviaty[1][1] = "Рым 7.14-8.2; Мц 10.9-15";
        cviaty[2][1] = "Рым 8.2-13; Мц 10.16-22";
        cviaty[3][1] = "Рым 8.22-27; Мц 10.23-31";
        cviaty[4][1] = "Рым 9.6-19; Мц 10.32-36,11.1";
        cviaty[5][1] = "Рым 3.28-4.3; Мц 7.24-8.4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica11(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Рым 9.18-33; Мц 11.2-15";
        cviaty[1][1] = "Рым 10.11-11.2; Мц 11.16-20";
        cviaty[2][1] = "Рым 11.2-12; Мц 11.20-26";
        cviaty[3][1] = "Рым 11.13-24; Мц 11.27-30";
        cviaty[4][1] = "Рым 11.25-36; Мц 12.1-8";
        cviaty[5][1] = "Рым 6.11-17; Мц 8.14-23";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica12(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Рым 12.4-5, 15-21; Мц 12.9-13";
        cviaty[1][1] = "Рым 14.9-18; Мц 12.14-16, 22-30";
        cviaty[2][1] = "Рым 15.7-16; Мц 12.38-45";
        cviaty[3][1] = "Рым 15.17-29; Мц 12.46-13.3";
        cviaty[4][1] = "Рым 16.1-16; Мц 13.4-9";
        cviaty[5][1] = "Рым 8.14-21; Мц 9.9-13";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica13(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Рым 16.17-24; Мц 13.10-23";
        cviaty[1][1] = "1 Кар 1.1-9; Мц 13.24-30";
        cviaty[2][1] = "1 Кар 2.9-3.8; Мц 13.31-36";
        cviaty[3][1] = "1 Кар 3.18-23; Мц 13.36-43";
        cviaty[4][1] = "1 Кар 4.5-8; Мц 13.44-54";
        cviaty[5][1] = "Рым 9.1-5; Мц 9.18-26";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica14(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Кар 5.9-6.11; Мц 13.54-58";
        cviaty[1][1] = "1 Кар 6.20-7.12;Мц 14.1-13";
        cviaty[2][1] = "1 Кар 7.12-24; Мц 14.35-15.11";
        cviaty[3][1] = "1 Кар 7.24-35; Мц 15.12-21";
        cviaty[4][1] = "1 Кар 7.35-8.7; Мц 15.29-31";
        cviaty[5][1] = "Рым 12.1-3; Мц 10.37-11.1";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica15(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Кар 9.13-18; Мц 16.1-6";
        cviaty[1][1] = "1 Кар 10.5-12; Мц 16.6-12";
        cviaty[2][1] = "1 Кар 10.12-22; Мц 16.20-24";
        cviaty[3][1] = "1 Кар 10.28-11.7; Мц 16.24-28";
        cviaty[4][1] = "1 Кар 11.8-22; Мц 17.10-18";
        cviaty[5][1] = "Рым 13.1-10; Мц 12.30-37";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica16(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Кар 11.31-12.6; Мц 18.1-11";
        cviaty[1][1] = "1 Кар 12.12-26; Мц 18.18-22, 19.1-2, 13-15";
        cviaty[2][1] = "1 Кар 13.4-14.5; Мц 20.1-16";
        cviaty[3][1] = "1 Кар 14.6-19; Мц 20.17-28";
        cviaty[4][1] = "1 Кар 14.26-40; Мц 21.12-14, 17-20";
        cviaty[5][1] = "Рым 14.6-9; Мц 15.32-39";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica17(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Кар 15.12-19; Мц 21.18-22";
        cviaty[1][1] = "1 Кар 15.29-38; Мц 21.23-27";
        cviaty[2][1] = "1 Кар 16.4-12; Мц 21.28-32";
        cviaty[3][1] = "2 Кар 1.1-7; Мц 21.43-46";
        cviaty[4][1] = "2 Кар 1.12-20; Мц 22.23-33";
        cviaty[5][0] = "Пачатак Усьпенскага посту";
        cviaty[5][1] = "Рым 15.30-33; Мц 17.24-18.4";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica18(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Кар 2.4-15; Мц 23.13-22";
        cviaty[1][1] = "2 Кар 2.14-3.3; Мц 23.23-28";
        cviaty[2][1] = "2 Кар 3.4-11; Мц 23.29-39";
        cviaty[3][1] = "2 Кар 4.1-6; Мц 24.13-28";
        cviaty[4][1] = "2 Кар 4.13-18; Мц 24.27-33, 42-51";
        cviaty[5][1] = "1 Кар 1.3-9; Мц 19.3-12";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica19(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Кар 5.10-15; Мк 1.9-15";
        cviaty[1][1] = "2 Кар 5.15-21; Мк 1.16-22";
        cviaty[2][1] = "2 Кар 6.11-16; Мк 1.23-28";
        cviaty[3][1] = "2 Кар 7.1-10; Мк 1.29-35";
        cviaty[4][1] = "2 Кар 7.10-16; Мк 2.18-22";
        cviaty[5][1] = "1 Кар 1.26-29; Мц 20.29-34";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica20(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Кар 8.7-15; Мк 3.6-12";
        cviaty[1][1] = "2 Кар 8.16-9.5; Мк 3.13-19";
        cviaty[2][1] = "2 Кар 9.12-10.7; Мк 3.20-27";
        cviaty[3][1] = "2 Кар 10.7-18; Мк 3.28-35";
        cviaty[4][1] = "2 Кар 11.5-21; Мк 4.1-9";
        cviaty[5][1] = "1 Кар 2.6-9; Мц 22.15-22";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica21(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Кар 12.10-19; Мк 4.10-23";
        cviaty[1][1] = "2 Кар 12.20-13.2; Мк 4.24-34";
        cviaty[2][1] = "2 Кар 13.3-13; Мк 4.35-41";
        cviaty[3][1] = "Гал 1.1-10, 20-2.5; Мк 5.1-20";
        cviaty[4][1] = "Гал 2.6-10; Мк 5.22-24, 35-6.1";
        cviaty[5][1] = "1 Кар 4.1-5; Мц 23.1-12";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica22(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Гал 2.11-16; Мк 5.24-34";
        cviaty[1][1] = "Гал 2.21-3.7; Мк 6.1-7";
        cviaty[2][1] = "Гал 3.15-22; Мк 6.7-13";
        cviaty[3][1] = "Гал 3.23-4.5; Мк 6.30-45";
        cviaty[4][1] = "Гал 4.8-21; Мк 6.45-53";
        cviaty[5][1] = "1 Кар 4.17-5.5; Мц 24.1-13";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica23(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Гал 4.28-5.10; Мк 6.54-7.8";
        cviaty[1][1] = "Гал 5.11-21; Мк 7.7-16";
        cviaty[2][1] = "Гал 6.2-10; Мк 7.14-24";
        cviaty[3][1] = "Эф 1.1-9; Мк 7.24-30";
        cviaty[4][1] = "Эф 1.7-17; Мк 8.1-10";
        cviaty[5][1] = "1 Кар 10.23-28; Мц 24.34-44";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica24(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Эф 1.22-2.3; Мк 10.46-52";
        cviaty[1][1] = "Эф 2.19-3.7; Мк 11.11-23";
        cviaty[2][1] = "Эф 3.8-21; Мк 11.23-26";
        cviaty[3][1] = "Эф 4.14-19; Мк 11.27-33";
        cviaty[4][1] = "Эф 4.17-25; Мк 12.1-12";
        cviaty[5][1] = "1 Кар 14.20-25; Мц 25.1-13";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica25(int NomerDniaNedeli, int i) { // Чтения после Крыжаузвышэння
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Эф 4.25-32; Лк 3.19-22";
        cviaty[1][1] = "Эф 5.20-26; Лк 3.23-4.1";
        cviaty[2][1] = "Эф 5.25-33; Лк 4.1-15";
        cviaty[3][1] = "Эф 5.33-6.9; Лк 4.16-22";
        cviaty[4][1] = "Эф 6.18-24; Лк 4.22-30";
        cviaty[5][1] = "1 Кар 15.39-45; Лк 4.31-36";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica26(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Флп 1.1-7; Лк 4.37-44";
        cviaty[1][1] = "Флп 1.8-14; Лк 5.12-16";
        cviaty[2][1] = "Флп 1.12-20; Лк 5.33-39";
        cviaty[3][1] = "Флп 1.20-27; Лк 6.12-19";
        cviaty[4][1] = "Флп 1.27-2.4; Лк 6.17-23";
        cviaty[5][1] = "1 Кар 15.58-16.3; Лк 5.17-26";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica27(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Флп 2.12-16; Лк 6.24-30";
        cviaty[1][1] = "Флп 2.17-23; Лк 6.37-45";
        cviaty[2][1] = "Флп 2.24-30; Лк 6.46-7.1";
        cviaty[3][1] = "Флп 3.1-8; Лк 7.17-30";
        cviaty[4][1] = "Флп 3.8-19; Лк 7.31-35";
        cviaty[5][1] = "2 Кар 1.8-11; Лк 5.27-32";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica28(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Флп 4.10-23; Лк 7.36-50";
        cviaty[1][1] = "Кал 1.1-2, 7-11; Лк 8.1-3";
        cviaty[2][1] = "Кал 1.18-23; Лк 8.22-25";
        cviaty[3][1] = "Кал 1.24-29; Лк 9.7-11";
        cviaty[4][1] = "Кал 2.1-7; Лк 9.12-18";
        cviaty[5][1] = "2 Кар 3.12-18; Лк 6.1-10";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica29(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Кал 2.13-20; Лк 9.18-22";
        cviaty[1][1] = "Кал 2.20-3.3; Лк 9.23-27";
        cviaty[2][1] = "Кал 3.17-4.1; Лк 9.44-50";
        cviaty[3][1] = "Кал 4.2-9; Лк 9.49-56";
        cviaty[4][1] = "Кал 4.10-18; Лк 10.1-15";
        cviaty[5][1] = "2 Кар 5.1-10; Лк 7.2-10";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica30(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Сал 1.1-5; Лк 10.22-24";
        cviaty[1][1] = "1 Сал 1.6-10; Лк 11.1-10";
        cviaty[2][1] = "1 Сал 2.1-8; Лк 11.9-13";
        cviaty[3][1] = "1 Сал 2.9-14; Лк 11.14-23";
        cviaty[4][1] = "1 Сал 2.14-3.8; Лк 11.23-26";
        cviaty[5][1] = "2 Кар 8.1-5; Лк 8.16-21";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica31(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Сал 2.20-3.8; Лк 11.29-33";
        cviaty[1][1] = "1 Сал 3.9-13; Лк 11.34-41";
        cviaty[2][1] = "1 Сал 4.1-12; Лк 11.42-46";
        cviaty[3][1] = "1 Сал 5.1-8; Лк 11.47-12.1";
        cviaty[4][1] = "1 Сал 5.9-13, 24-28; Лк 12.2-12";
        cviaty[5][1] = "2 Кар 11.1-6; Лк 9.1-6";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica32(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Сал 1.1-10; Лк 12.13-15, 22-31";
        cviaty[1][1] = "2 Сал 1.10-2.2; Лк 12.42-48";
        cviaty[2][1] = "2 Сал 2.1-12; Лк 12.48-59";
        cviaty[3][1] = "2 Сал 2.13-3.5; Лк 13.1-9";
        cviaty[4][1] = "2 Сал 3.6-18; Лк 13.31-35";
        cviaty[5][1] = "Гал 1.3-10; Лк 9.37-43";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica33(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Цім 1.1-7; Лк 14.12-15";
        cviaty[1][0] = "Пачатак Каляднага посту";
        cviaty[1][1] = "1 Цім 1.8-14; Лк 14.25-35";
        cviaty[1][2] = "4";
        cviaty[2][1] = "1 Цім 1.18-20, 2.8-15; Лк 15.1-10";
        cviaty[3][1] = "1 Цім 3.1-13; Лк 16.1-9";
        cviaty[4][1] = "1 Цім 4.4-8, 16; Лк 16.15-18, 17.1-4";
        cviaty[5][1] = "Гал 3.8-12; Лк 9.57-62";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica34(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Цім 5.1-10; Лк 17.20-25";
        cviaty[1][1] = "1 Цім 5.11-21; Лк 17.26-37";
        cviaty[2][1] = "1 Цім 5.22-6.11; Лк 18.15-17, 26-30";
        cviaty[3][1] = "1 Цім 6.17-21; Лк 18.31-34";
        cviaty[4][1] = "2 Цім 1.1-2, 8-18; Лк 19.12-28";
        cviaty[5][1] = "Гал 5.22-6.2; Лк 10.19-21";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica35(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Цім 2.20-26; Лк 19.37-44";
        cviaty[1][1] = "2 Цім 3.16-4.4; Лк 19.45-48";
        cviaty[2][1] = "2 Цім 4.9-22; Лк 20.1-8";
        cviaty[3][1] = "Ціт 1.5-2.1; Лк 20.9-18";
        cviaty[4][1] = "Ціт 1.15-2.10; Лк 20.19-26";
        cviaty[5][1] = "Эф 1.16-23; Лк 12.32-40";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica36(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Габ 3.5-11, 17-19; Лк 20.27-44";
        cviaty[1][1] = "Габ 4.1-13; Лк 21.12-19";
        cviaty[2][1] = "Габ 5.11-6.8; Лк 21.5-7, 10-11, 20-24";
        cviaty[3][1] = "Габ 7.1-6; Лк 21.28-33";
        cviaty[4][1] = "Габ 7.18-25; Лк 21.37-22.8";
        cviaty[5][1] = "Эф 2.11-13; Лк 13.18-29";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica37(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Габ 8.7-13; Мк 8.11-21";
        cviaty[1][1] = "Габ 9.8-10; Мк 8.22-26";
        cviaty[2][1] = "Габ 10.1-18; Мк 8.30-34";
        cviaty[3][1] = "Габ 10.35-11.7; Мк 9.10-16";
        cviaty[4][1] = "Габ 11.8, 11-16; Мк 9.33-41";
        cviaty[5][1] = "Эф 5.1-8; Лк 14.1-11";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica38(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Габ 11.17-23; Мк 9.42-10.1";
        cviaty[1][1] = "Габ 12.25-26, 13.22-25; Мк 10.2-12";
        cviaty[2][1] = "Як 1.1-18; Мк 10.11-16";
        cviaty[3][1] = "Як 1.19-27; Мк 10.17-27";
        cviaty[4][1] = "Як 2.1-13; Мк 10.23-32";
        cviaty[5][1] = "Кал 1.3-6; Лк 16.10-15";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica39(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "Як 2.14-26; Мк 10.46-52";
        cviaty[1][1] = "Як 3.1-10; Мк 11.11-23";
        cviaty[2][1] = "Як 3.11-4.6; Мк 11.23-26";
        cviaty[3][1] = "Як 4.7-5.9; Мк 11.27-33";
        cviaty[4][1] = "1 Пт 1.1-2, 10-12, 2.6-10; Мк 12.1-12";
        cviaty[5][1] = "1 Сал 5.14-23; Лк 17.3-10";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica40(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Пт 2.21-3.9; Мк 12.13-17";
        cviaty[1][1] = "1 Пт 3.10-22; Мк 12.18-27";
        cviaty[2][1] = "1 Пт 4.1-11; Мк 12.28-37";
        cviaty[3][1] = "1 Пт 4.12-5.5; Мк 12.38-44";
        cviaty[4][1] = "2 Пт 1.1-10; Мк 13.1-8";
        cviaty[5][1] = "2 Цім 2.11-19; Лк 18.2-8";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica41(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "2 Пт 1.20-2.9; Мк 13.9-13";
        cviaty[1][1] = "2 Пт 2.9-22; Мк 13.14-23";
        cviaty[2][1] = "2 Пт 3.1-18; Мк 13.24-31";
        cviaty[3][1] = "1 Ян 1.8-2.6; Мк 13.31-14.2";
        cviaty[4][1] = "1 Ян 2.7-17; Мк 14.3-9";
        cviaty[5][1] = "2 Цім 3.1-9; Лк 20.45-21.4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica42(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "1 Ян 2.18-3.10; Мк 11.1-11";
        cviaty[1][1] = "1 Ян 3.11-20; Мк 14.10-42";
        cviaty[2][1] = "1 Ян 3.21-4.6; Мк 14.43-15.1";
        cviaty[3][1] = "1 Ян 4.20-5.21; Мк 15.1-15";
        cviaty[4][1] = "2 Ян 1.1-13; Мк 15.22-25, 33-41";
        cviaty[5][1] = "1 Кар 10.23-28;<br>Лк 21.8-9, 25-27, 33-36";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica43(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "3 Ян 1.1-15; Лк 19.29-40, 22.7-39";
        cviaty[1][1] = "Юд 1.1-10; Лк 22.39-42, 45-23.1";
        cviaty[2][1] = "Літургіі няма<br>На вячэрні: Яэль 3.12-21";
        cviaty[3][1] = "Юд 1.11-25; Лк 23.1-34, 44-56";
        cviaty[4][1] = "Літургіі няма<br>На вячэрні: Зах 8.19-23";
        cviaty[5][1] = "Рым 14.19-26; Мц 6.1-13";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica44(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][0] = "Пачатак Вялікага посту";
        cviaty[0][1] = "На вячэрні: Быц 1.1-13;<br>Высл 1.1-20<br>Літургіі няма<br>Вялікі канон сьв. Андрэя Крыцкага";
        cviaty[0][2] = "4";
        cviaty[1][1] = "На вячэрні: Быц 1.14-23;<br>Высл 1.20-33<br>Літургіі няма<br>Вялікі канон сьв. Андрэя Крыцкага";
        cviaty[2][1] = "На вячэрні: Быц 1.24-2.3;<br>Высл 2.1-22<br>Літургія раней асьвячаных дароў<br>Вялікі канон сьв. Андрэя Крыцкага";
        cviaty[3][1] = "На вячэрні: Быц 2.4-19;<br>Высл 3.1-18<br>Літургіі няма<br>Вялікі канон сьв. Андрэя Крыцкага";
        cviaty[4][1] = "На вячэрні: Быц 2.20-3.20;<br>Высл 3.19-34<br>Літургія раней асьвячаных дароў";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 1.1-12; Мк 2.23-3.5";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica45(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "На вячэрні: Быц 3.21-4.7;<br>Высл 3.34-4.22<br>Літургіі няма";
        cviaty[1][1] = "На вячэрні: Быц 4.8-15;<br>Высл 5.1-15<br>Літургіі няма";
        cviaty[2][1] = "На вячэрні: Быц 4.16-26;<br>Высл 5.15-6.3<br>Літургія раней асьвячаных дароў";
        cviaty[3][1] = "На вячэрні: Быц 5.1-24;<br>Высл 6.3-20<br>Літургіі няма";
        cviaty[4][1] = "На вячэрні: Быц 5.32-6.8;<br>Высл 6.20-7.1<br>Літургія раней асьвячаных дароў";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 3.12-16; Мк 1.35-44";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica46(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "На вячэрні: Быц 6.9-22;<br>Высл 8.1-21<br>Літургіі няма";
        cviaty[1][1] = "На вячэрні: Быц 7.1-5;<br>Высл 8.32-9.11<br>Літургіі няма";
        cviaty[2][1] = "На вячэрні: Быц 7.6-9;<br>Высл 9.12-18<br>Літургія раней асьвячаных дароў";
        cviaty[3][1] = "На вячэрні: Быц 7.11-8.3;<br>Высл 10.1-22<br>Літургіі няма";
        cviaty[4][1] = "На вячэрні: Быц 8.4-21;<br>Высл 10.31-11.12<br>Літургія раней асьвячаных дароў";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 10.32-38; Мк 2.14-17";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica47(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "На вячэрні: Быц 8.21-9.7;<br>Высл 11.19-12.6<br>Літургіі няма";
        cviaty[1][1] = "На вячэрні: Быц 9.8-17;<br>Высл 12.8-22;<br>Літургіі няма";
        cviaty[2][1] = "На вячэрні: Быц 9.18-10.1;<br>Высл 12.23-13.9<br>Літургія раней асьвячаных дароў";
        cviaty[3][1] = "На вячэрні: Быц 10.32-11.9;<br>Высл 13.20-14.6<br>Літургіі няма";
        cviaty[4][1] = "На вячэрні: Быц 12.1-7;<br>Высл 14.15-26<br>Літургія раней асьвячаных дароў";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 6.9-12; Мк 7.31-37";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica48(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "На вячэрні: Быц 13.12-18;<br>Высл 14.27-15.4<br>Літургіі няма";
        cviaty[1][1] = "На вячэрні: Быц 15.1-15;<br>Высл 15.7-19<br>Літургіі няма";
        cviaty[2][1] = "На вячэрні: Быц 17.1-9;<br>Высл 15.20-16.9<br>Літургія раней асьвячаных дароў";
        cviaty[3][1] = "На вячэрні: Быц 18.20-33;<br>Высл 16.17-17.17<br>Вялікі канон сьв. Андрэя Крыцкага<br>Літургія раней асьвячаных дароў";
        cviaty[4][1] = "На вячэрні: Быц 22.1-18;<br>Высл 17.17-18.5<br>Літургія раней асьвячаных дароў";
        cviaty[5][0] = "Субота Акафісту";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 9.24-28; Мк 8.27-31";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica49(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][1] = "На вячэрні: Быц 27.1-41;<br>Высл 19.16-25<br>Літургіі няма";
        cviaty[1][1] = "На вячэрні: Быц 31.3-16;<br>Высл 21.3-21<br>Літургіі няма";
        cviaty[2][1] = "На вячэрні: Быц 43.26-31, 45.1-16;<br>Высл 21.23-22.4<br>Літургія раней асьвячаных дароў";
        cviaty[3][1] = "На вячэрні: Быц 46.1-7;<br>Высл 23.15-24.5<br>Літургіі няма";
        cviaty[4][1] = "На вячэрні: Быц 49.33-50.26;<br>Высл 31.8-31<br>Літургія раней асьвячаных дароў";
        cviaty[5][0] = "Лазарава субота";
        cviaty[5][1] = "Літургія сьв.<br>Яна Залатавуснага<br>Габ 12.28-13.8; Ян 11.1-45";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    private String Sadmica50(int NomerDniaNedeli, int i) {
        NomerDniaNedeli = NomerDniaNedeli - 1;

        String[][] cviaty = new String[6][3];
        cviaty[0][0] = "Вялікі панядзелак";
        cviaty[0][1] = "На ютрані: Мц 21.18-43;<br>На вячэрні: Вых 1.1-20; Ёў 1.1-12;<br>Літургія раней асьвячаных дароў<br>Мц 24.3-35";
        cviaty[0][2] = "4";
        cviaty[1][0] = "Вялікі аўторак";
        cviaty[1][1] = "На ютрані: Мц 22.15-23.39;<br>На вячэрні: Вых 2.5-10; Ёў 1.13-22;<br>Літургія раней асьвячаных дароў<br>Мц 24.36-26.2";
        cviaty[1][2] = "4";
        cviaty[2][0] = "Вялікая серада";
        cviaty[2][1] = "На ютрані: Ян 12.17-50;<br>На вячэрні: Вых 2.11-22; Ёў 2.1-10;<br>Літургія раней асьвячаных дароў<br>Мц 26.6-16";
        cviaty[2][2] = "4";
        cviaty[3][0] = "Вялікі чацьвер";
        cviaty[3][1] = "На ютрані: Лк 22.1-39;<br>На вячэрні: Вых 19.10-19;<br>Ёў 38.1-23, 42.1-5; Іс 50.4-11;<br>Літургія сьв. Васіля Вялікага<br>з вячэрняй 1 Кар 11.23-32; Мц 26.1-20;<br>Ян 13.3-17; Мц 26.21-39; Лк 22.43-45;<br>Мц 26.40-27.2";
        cviaty[3][2] = "4";
        cviaty[4][0] = "Вялікая пятніца<br>Вялікія гадзіны";
        cviaty[4][1] = "На вячэрні: Вых 33.11-23; Ёў 42.12-17; Іс 52.13-53.12; Іс 54.1-17; 1 Кар 1.18-2.2;<br>Мц 27.1-38; Лк 23.39-43; Мц 27.39-54;<br>Ян 19.31-37; Мц 27.55-61<br>Літургіі няма";
        cviaty[4][2] = "4";
        cviaty[5][0] = "Вялікая субота";
        cviaty[5][1] = "На ютрані: Езэк 37.1-14; 1 Кар 5.6-8;<br>Гал 3.13-14; Мц 27.62-66;<br>Літургія сьв. Васіля Вялікага<br>з вячэрняй: Рым 6.3-11; Мц 28.1-20";
        cviaty[5][2] = "4";
        return cviaty[NomerDniaNedeli][i];
    }

    /*private String ton(int numar) {
        String[] ton = new String[11];
        ton[0] = "На ютрані: Мц 28.16-20;";
        ton[1] = "На ютрані: Мк 16.1-8;";
        ton[2] = "На ютрані: Мк 16.9-20;";
        ton[3] = "На ютрані: Лк 24.1-12;";
        ton[4] = "На ютрані: Лк 24.12-35;";
        ton[5] = "На ютрані: Лк 24.36-53;";
        ton[6] = "На ютрані: Ян 20.1-10;";
        ton[7] = "На ютрані: Ян 20.11-18;";
        ton[8] = "На ютрані: Ян 20.19-31;";
        ton[9] = "На ютрані: Ян 21.1-14;";
        ton[10] = "На ютрані: Ян 21.15-25;";
        return ton[numar];
    }*/

    private int Niadzeli(int year) {
        GregorianCalendar r = new GregorianCalendar(year, Calendar.SEPTEMBER, 14, 0, 0, 0);
        GregorianCalendar g = new GregorianCalendar(year, pascha_month(year), pascha_date(year), 0, 0, 0);
        int count = 1;
        for (int i = 0; i < 366; i++) {
            if (g.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && i != 0) {
                count++;
            }
            if (r.get(Calendar.DAY_OF_YEAR) == g.get(Calendar.DAY_OF_YEAR)) {
                break;
            }
            g.add(Calendar.DATE, 1);
        }
        return count;
    }

    String main(int year_ch) {
        int count = 0;
        GregorianCalendar pasha = new GregorianCalendar(year_ch, pascha_month(year_ch), pascha_date(year_ch), 0, 0, 0);
        int week_of_year_pasha = pasha.get(Calendar.WEEK_OF_YEAR);
        GregorianCalendar pasha_old = new GregorianCalendar(year_ch - 1, pascha_month(year_ch - 1), pascha_date(year_ch - 1), 0, 0, 0);

        StringBuilder sb = new StringBuilder();
        sb.append("<?php\n" +
                "/***********************************************************************\n" +
                " *                      Літургічны каляндар                         *\n" +
                " * ==================================================================== *\n" +
                " *                                                                      *\n" +
                " * Copyright (c) 2014 by Oleg Dydyshko                                  *\n" +
                " * http://carkva-gazeta.by                                             *\n" +
                " *                                                                      *\n" +
                " * This program is free software. You can redistribute it and/or modify *\n" +
                " * it under the terms of the GNU General Public License as published by *\n" +
                " * the Free Software Foundation; either version 2 of the License.       *\n" +
                " *                                                                      *\n" +
                " ***********************************************************************//*\n" +
                "\n" +
                "//Здесь Очередные чтения, Святые и праздники привязаные к Пасхе\n" +
                "//\n" +
                "/*******************************************************************************\n" +
                " * Основной формат: Лк 10.38-11.2, Лк 10.38-42                                  *\n" +
                " * Допустимые значения: Лк 10.38, 10.38-11.2, 10.38-42, 10.38, 38               *\n" +
                " * Недостающие элементы чтений автоматически добавляются из предыдущего чтения  *\n" +
                " * Расположение других элементов - произвольно                                  *\n" +
                " * Тэг <br> - перенос строки                                                    *\n" +
                " * BAG(ошибка): чтение Дз 6.8-7.5, 47-60 выведет Дз 6.8-7.5, Дз 6.47-60         *\n" +
                " * BAG 2: Ян 6.35б-39 выведет Ян 6.35-39                                        *\n" +
                " ********************************************************************************/\n");
        int nedela = 1, nedela_Nadzel = 1;
        int kryjauzvushenne = Niadzeli(year_ch);
        for (int i = 1; i <= 189; i++) {
            int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
            String Sadmica = "", Bydny = "";
            if (denNedeli != 0) {
                switch (nedela) {
                    case 1:
                        Sadmica = Sadmica1(denNedeli, 1);
                        Bydny = Sadmica1(denNedeli, 0);
                        break;
                    case 2:
                        Sadmica = Sadmica2(denNedeli, 1);
                        Bydny = Sadmica2(denNedeli, 0);
                        break;
                    case 3:
                        Sadmica = Sadmica3(denNedeli, 1);
                        Bydny = Sadmica3(denNedeli, 0);
                        break;
                    case 4:
                        Sadmica = Sadmica4(denNedeli, 1);
                        Bydny = Sadmica4(denNedeli, 0);
                        break;
                    case 5:
                        Sadmica = Sadmica5(denNedeli, 1);
                        Bydny = Sadmica5(denNedeli, 0);
                        break;
                    case 6:
                        Sadmica = Sadmica6(denNedeli, 1);
                        Bydny = Sadmica6(denNedeli, 0);
                        break;
                    case 7:
                        Sadmica = Sadmica7(denNedeli, 1);
                        Bydny = Sadmica7(denNedeli, 0);
                        break;
                    case 8:
                        Sadmica = Sadmica8(denNedeli, 1);
                        Bydny = Sadmica8(denNedeli, 0);
                        break;
                    case 9:
                        Sadmica = Sadmica9(denNedeli, 1);
                        Bydny = Sadmica9(denNedeli, 0);
                        break;
                    case 10:
                        Sadmica = Sadmica10(denNedeli, 1);
                        Bydny = Sadmica10(denNedeli, 0);
                        break;
                    case 11:
                        Sadmica = Sadmica11(denNedeli, 1);
                        Bydny = Sadmica11(denNedeli, 0);
                        break;
                    case 12:
                        Sadmica = Sadmica12(denNedeli, 1);
                        Bydny = Sadmica12(denNedeli, 0);
                        break;
                    case 13:
                        Sadmica = Sadmica13(denNedeli, 1);
                        Bydny = Sadmica13(denNedeli, 0);
                        break;
                    case 14:
                        Sadmica = Sadmica14(denNedeli, 1);
                        Bydny = Sadmica14(denNedeli, 0);
                        break;
                    case 15:
                        Sadmica = Sadmica15(denNedeli, 1);
                        Bydny = Sadmica15(denNedeli, 0);
                        break;
                    case 16:
                        Sadmica = Sadmica16(denNedeli, 1);
                        Bydny = Sadmica16(denNedeli, 0);
                        break;
                    case 17:
                        Sadmica = Sadmica17(denNedeli, 1);
                        Bydny = Sadmica17(denNedeli, 0);
                        break;
                    case 18:
                        Sadmica = Sadmica18(denNedeli, 1);
                        Bydny = Sadmica18(denNedeli, 0);
                        break;
                    case 19:
                        Sadmica = Sadmica19(denNedeli, 1);
                        Bydny = Sadmica19(denNedeli, 0);
                        break;
                    case 20:
                        Sadmica = Sadmica20(denNedeli, 1);
                        Bydny = Sadmica20(denNedeli, 0);
                        break;
                    case 21:
                        Sadmica = Sadmica21(denNedeli, 1);
                        Bydny = Sadmica21(denNedeli, 0);
                        break;
                    case 22:
                        Sadmica = Sadmica22(denNedeli, 1);
                        Bydny = Sadmica22(denNedeli, 0);
                        break;
                    case 23:
                        Sadmica = Sadmica23(denNedeli, 1);
                        Bydny = Sadmica23(denNedeli, 0);
                        break;
                    case 24:
                        Sadmica = Sadmica24(denNedeli, 1);
                        Bydny = Sadmica24(denNedeli, 0);
                        break;
                }
            }
            if (Bydny == null) Bydny = "";
            String nedP;
            switch (denNedeli) {
                case 1:
                    nedP = "//1";
                    break;
                case 2:
                    nedP = "//2";
                    break;
                case 3:
                    nedP = "//3";
                    break;
                case 4:
                    nedP = "//4";
                    break;
                case 5:
                    nedP = "//5";
                    break;
                case 6:
                    nedP = "//6";
                    break;
                default:
                    nedP = "";
                    break;
            }
            count++;
            if (denNedeli == 0) {
                sb.append("\n");
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
            } else {
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
            }
            if (nedela == 24 && denNedeli == 6) {
                nedela = 25;
                nedela_Nadzel++;
                break;
            }
            pasha.add(Calendar.DATE, 1);
            if (i % 7 == 0) {
                nedela++;
                nedela_Nadzel++;
            }
        }
        if (kryjauzvushenne == 26) {
            int nedel_old = nedela - 2;
            pasha.add(Calendar.DATE, -14);
            for (int i = 1; i <= 14; i++) {
                int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
                String Sadmica = "", Bydny = "";
                if (denNedeli != 0) {
                    switch (nedel_old) {
                        case 23:
                            Sadmica = Sadmica23(denNedeli, 1);
                            Bydny = Sadmica23(denNedeli, 0);
                            break;
                        case 24:
                            Sadmica = Sadmica24(denNedeli, 1);
                            Bydny = Sadmica24(denNedeli, 0);
                            break;
                    }
                }
                if (Bydny == null) Bydny = "";
                String nedP;
                switch (denNedeli) {
                    case 1:
                        nedP = "//1";
                        break;
                    case 2:
                        nedP = "//2";
                        break;
                    case 3:
                        nedP = "//3";
                        break;
                    case 4:
                        nedP = "//4";
                        break;
                    case 5:
                        nedP = "//5";
                        break;
                    case 6:
                        nedP = "//6";
                        break;
                    default:
                        nedP = "";
                        break;
                }
                count++;
                if (denNedeli == 0) {
                    sb.append("\n");
                    sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
                } else {
                    sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
                }

                if (kryjauzvushenne + 1 == nedel_old)
                    break;
                pasha.add(Calendar.DATE, 1);
                if (i % 7 == 0) {
                    nedela++;
                    nedel_old++;
                    nedela_Nadzel++;
                }
            }
        }
        if (kryjauzvushenne == 25) {
            pasha.add(Calendar.DATE, -7);
            int nedela_old = nedela - 1;
            for (int i = 1; i <= 7; i++) {
                int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
                String Sadmica = "", Bydny = "";
                if (denNedeli != 0) {
                    if (nedela_old == 24) {
                        Sadmica = Sadmica24(denNedeli, 1);
                        Bydny = Sadmica24(denNedeli, 0);
                    }
                }
                if (Bydny == null) Bydny = "";
                String nedP;
                switch (denNedeli) {
                    case 1:
                        nedP = "//1";
                        break;
                    case 2:
                        nedP = "//2";
                        break;
                    case 3:
                        nedP = "//3";
                        break;
                    case 4:
                        nedP = "//4";
                        break;
                    case 5:
                        nedP = "//5";
                        break;
                    case 6:
                        nedP = "//6";
                        break;
                    default:
                        nedP = "";
                        break;
                }
                count++;
                if (denNedeli == 0) {
                    sb.append("\n");
                    sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
                } else {
                    sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
                }

                if (kryjauzvushenne + 1 == nedela_old)
                    break;
                pasha.add(Calendar.DATE, 1);
                if (i % 7 == 0) {
                    nedela++;
                    nedela_old++;
                    nedela_Nadzel++;
                }
            }
        }
        boolean repit = true;
        nedela = 25;
        for (int i = 1; i <= 200; i++) {
            int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
            String Sadmica = "", Bydny = "";
            if (denNedeli != 0) {
                switch (nedela) {
                    case 25:
                        Sadmica = Sadmica25(denNedeli, 1);//После Крыжаузвышэння
                        Bydny = Sadmica25(denNedeli, 0);
                        break;
                    case 26:
                        Sadmica = Sadmica26(denNedeli, 1);
                        Bydny = Sadmica26(denNedeli, 0);
                        break;
                    case 27:
                        Sadmica = Sadmica27(denNedeli, 1);
                        Bydny = Sadmica27(denNedeli, 0);
                        break;
                    case 28:
                        Sadmica = Sadmica28(denNedeli, 1);
                        Bydny = Sadmica28(denNedeli, 0);
                        break;
                    case 29:
                        Sadmica = Sadmica29(denNedeli, 1);
                        Bydny = Sadmica29(denNedeli, 0);
                        break;
                    case 30:
                        Sadmica = Sadmica30(denNedeli, 1);
                        Bydny = Sadmica30(denNedeli, 0);
                        break;
                    case 31:
                        Sadmica = Sadmica31(denNedeli, 1);
                        Bydny = Sadmica31(denNedeli, 0);
                        break;
                    case 32:
                        Sadmica = Sadmica32(denNedeli, 1);
                        Bydny = Sadmica32(denNedeli, 0);
                        break;
                    case 33:
                        Sadmica = Sadmica33(denNedeli, 1);
                        Bydny = Sadmica33(denNedeli, 0);
                        break;
                    case 34:
                        Sadmica = Sadmica34(denNedeli, 1);
                        Bydny = Sadmica34(denNedeli, 0);
                        break;
                    case 35:
                        Sadmica = Sadmica35(denNedeli, 1);
                        Bydny = Sadmica35(denNedeli, 0);
                        break;
                    case 36:
                        Sadmica = Sadmica36(denNedeli, 1);
                        Bydny = Sadmica36(denNedeli, 0);
                        break;
                    case 37:
                        Sadmica = Sadmica37(denNedeli, 1);
                        Bydny = Sadmica37(denNedeli, 0);
                        break;
                    case 38:
                        Sadmica = Sadmica38(denNedeli, 1);
                        Bydny = Sadmica38(denNedeli, 0);
                        break;
                    case 39:
                        Sadmica = Sadmica39(denNedeli, 1);
                        Bydny = Sadmica39(denNedeli, 0);
                        break;
                    case 40:
                        Sadmica = Sadmica40(denNedeli, 1);//О закхее
                        Bydny = Sadmica40(denNedeli, 0);
                        break;
                    /*case 41:
                        Sadmica = Sadmica41(denNedeli, 1);//о Мытаре и фарисее
                        Bydny = Sadmica41(denNedeli, 0);
                        break;
                    case 42:
                        Sadmica = Sadmica42(denNedeli, 1);
                        Bydny = Sadmica42(denNedeli, 0);
                        break;
                    case 43:
                        Sadmica = Sadmica43(denNedeli, 1);
                        Bydny = Sadmica43(denNedeli, 0);
                        break;
                    case 44:
                        Sadmica = Sadmica44(denNedeli, 1);
                        Bydny = Sadmica44(denNedeli, 0);
                        break;
                    case 45:
                        Sadmica = Sadmica45(denNedeli, 1);
                        Bydny = Sadmica45(denNedeli, 0);
                        break;
                    case 46:
                        Sadmica = Sadmica46(denNedeli, 1);
                        Bydny = Sadmica46(denNedeli, 0);
                        break;
                    case 47:
                        Sadmica = Sadmica47(denNedeli, 1);
                        Bydny = Sadmica47(denNedeli, 0);
                        break;
                    case 48:
                        Sadmica = Sadmica48(denNedeli, 1);
                        Bydny = Sadmica48(denNedeli, 0);
                        break;
                    case 49:
                        Sadmica = Sadmica49(denNedeli, 1);
                        Bydny = Sadmica49(denNedeli, 0);
                        break;
                    case 50:
                        Sadmica = Sadmica50(denNedeli, 1);
                        Bydny = Sadmica50(denNedeli, 0);
                        break;*/
                }
            }
            if (Bydny == null) Bydny = "";
            String nedP;
            switch (denNedeli) {
                case 1:
                    nedP = "//1";
                    break;
                case 2:
                    nedP = "//2";
                    break;
                case 3:
                    nedP = "//3";
                    break;
                case 4:
                    nedP = "//4";
                    break;
                case 5:
                    nedP = "//5";
                    break;
                case 6:
                    nedP = "//6";
                    break;
                default:
                    nedP = "";
                    break;
            }
            count++;
            if (denNedeli == 0) {
                sb.append("\n");
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
            } else {
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
            }
            pasha.add(Calendar.DATE, 1);
            if (pasha.get(Calendar.YEAR) != year_ch) {
                if (repit) {
                    pasha.add(Calendar.DATE, -1);
                    repit = false;
                } else {
                    break;
                }
            }
            if (i % 7 == 0) {
                nedela++;
                nedela_Nadzel++;
            }
            //if (nedela == 41) break;
        }
        nedela = 1;
        nedela_Nadzel = 1;
        for (int i = 1; i <= 300; i++) {
            if (pasha_old.get(Calendar.YEAR) != year_ch) {
                if (i == 1) {
                    kryjauzvushenne = Niadzeli(year_ch - 1);
                    for (int i2 = 1; i2 <= 168; i2++) {
                        if (kryjauzvushenne + 1 == nedela) {
                            nedela = 25;
                            break;
                        }
                        pasha_old.add(Calendar.DATE, 1);
                        if (i2 % 7 == 0) {
                            nedela++;
                            nedela_Nadzel++;
                        }
                    }
                    if (kryjauzvushenne == 26) {
                        int nedel_old = nedela - 2;
                        pasha_old.add(Calendar.DATE, -14);
                        for (int i2 = 1; i2 <= 14; i2++) {
                            if (kryjauzvushenne + 1 == nedel_old)
                                break;
                            pasha_old.add(Calendar.DATE, 1);
                            if (i2 % 7 == 0) {
                                nedela++;
                                nedel_old++;
                                nedela_Nadzel++;
                            }
                        }
                    }
                    if (kryjauzvushenne == 25) {
                        pasha_old.add(Calendar.DATE, -7);
                        int nedel_old = nedela - 1;
                        for (int i2 = 1; i2 <= 7; i2++) {
                            if (kryjauzvushenne + 1 == nedel_old)
                                break;
                            pasha_old.add(Calendar.DATE, 1);
                            if (i2 % 7 == 0) {
                                nedela++;
                                nedel_old++;
                                nedela_Nadzel++;
                            }
                        }
                    }
                }
                pasha_old.add(Calendar.DATE, 1);
                if (i % 7 == 0) {
                    nedela++;
                    nedela_Nadzel++;
                }
                continue;
            }
            int denNedeli = pasha_old.get(Calendar.DAY_OF_WEEK) - 1;
            String Sadmica = "", Bydny = "";
            if (denNedeli != 0) {
                switch (nedela) {
                    case 25:
                        Sadmica = Sadmica25(denNedeli, 1);//После Крыжаузвышэння
                        Bydny = Sadmica25(denNedeli, 0);
                        break;
                    case 26:
                        Sadmica = Sadmica26(denNedeli, 1);
                        Bydny = Sadmica26(denNedeli, 0);
                        break;
                    case 27:
                        Sadmica = Sadmica27(denNedeli, 1);
                        Bydny = Sadmica27(denNedeli, 0);
                        break;
                    case 28:
                        Sadmica = Sadmica28(denNedeli, 1);
                        Bydny = Sadmica28(denNedeli, 0);
                        break;
                    case 29:
                        Sadmica = Sadmica29(denNedeli, 1);
                        Bydny = Sadmica29(denNedeli, 0);
                        break;
                    case 30:
                        Sadmica = Sadmica30(denNedeli, 1);
                        Bydny = Sadmica30(denNedeli, 0);
                        break;
                    case 31:
                        Sadmica = Sadmica31(denNedeli, 1);
                        Bydny = Sadmica31(denNedeli, 0);
                        break;
                    case 32:
                        Sadmica = Sadmica32(denNedeli, 1);
                        Bydny = Sadmica32(denNedeli, 0);
                        break;
                    case 33:
                        Sadmica = Sadmica33(denNedeli, 1);
                        Bydny = Sadmica33(denNedeli, 0);
                        break;
                    case 34:
                        Sadmica = Sadmica34(denNedeli, 1);
                        Bydny = Sadmica34(denNedeli, 0);
                        break;
                    case 35:
                        Sadmica = Sadmica35(denNedeli, 1);
                        Bydny = Sadmica35(denNedeli, 0);
                        break;
                    case 36:
                        Sadmica = Sadmica36(denNedeli, 1);
                        Bydny = Sadmica36(denNedeli, 0);
                        break;
                    case 37:
                        Sadmica = Sadmica37(denNedeli, 1);
                        Bydny = Sadmica37(denNedeli, 0);
                        break;
                    case 38:
                        Sadmica = Sadmica38(denNedeli, 1);
                        Bydny = Sadmica38(denNedeli, 0);
                        break;
                    case 39:
                        Sadmica = Sadmica39(denNedeli, 1);
                        Bydny = Sadmica39(denNedeli, 0);
                        break;
                    case 40:
                        Sadmica = Sadmica40(denNedeli, 1);//О закхее
                        Bydny = Sadmica40(denNedeli, 0);
                        break;
                }
            }
            if (Bydny == null) Bydny = "";
            String nedP;
            switch (denNedeli) {
                case 1:
                    nedP = "//1";
                    break;
                case 2:
                    nedP = "//2";
                    break;
                case 3:
                    nedP = "//3";
                    break;
                case 4:
                    nedP = "//4";
                    break;
                case 5:
                    nedP = "//5";
                    break;
                case 6:
                    nedP = "//6";
                    break;
                default:
                    nedP = "";
                    break;
            }
            count++;
            if (denNedeli == 0) {
                sb.append("\n");
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
            } else {
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
            }
            pasha_old.add(Calendar.DATE, 1);
            if (i % 7 == 0) {
                nedela++;
                nedela_Nadzel++;
            }
            if (nedela_Nadzel < 50) break;
        }

        nedela = 40;
        nedela_Nadzel = 40;
        pasha = new GregorianCalendar(year_ch, pascha_month(year_ch), pascha_date(year_ch), 0, 0, 0);
        pasha.add(Calendar.DATE, -70);
        for (int i = 1; i <= (week_of_year_pasha - 11) * 7; i++) {
            int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
            String Sadmica = "", Bydny = "";
            if (denNedeli != 0) {
                switch (nedela) {
                    case 25:
                        Sadmica = Sadmica25(denNedeli, 1);//После Крыжаузвышэння
                        Bydny = Sadmica25(denNedeli, 0);
                        break;
                    case 26:
                        Sadmica = Sadmica26(denNedeli, 1);
                        Bydny = Sadmica26(denNedeli, 0);
                        break;
                    case 27:
                        Sadmica = Sadmica27(denNedeli, 1);
                        Bydny = Sadmica27(denNedeli, 0);
                        break;
                    case 28:
                        Sadmica = Sadmica28(denNedeli, 1);
                        Bydny = Sadmica28(denNedeli, 0);
                        break;
                    case 29:
                        Sadmica = Sadmica29(denNedeli, 1);
                        Bydny = Sadmica29(denNedeli, 0);
                        break;
                    case 30:
                        Sadmica = Sadmica30(denNedeli, 1);
                        Bydny = Sadmica30(denNedeli, 0);
                        break;
                    case 31:
                        Sadmica = Sadmica31(denNedeli, 1);
                        Bydny = Sadmica31(denNedeli, 0);
                        break;
                    case 32:
                        Sadmica = Sadmica32(denNedeli, 1);
                        Bydny = Sadmica32(denNedeli, 0);
                        break;
                    case 33:
                        Sadmica = Sadmica33(denNedeli, 1);
                        Bydny = Sadmica33(denNedeli, 0);
                        break;
                    case 34:
                        Sadmica = Sadmica34(denNedeli, 1);
                        Bydny = Sadmica34(denNedeli, 0);
                        break;
                    case 35:
                        Sadmica = Sadmica35(denNedeli, 1);
                        Bydny = Sadmica35(denNedeli, 0);
                        break;
                    case 36:
                        Sadmica = Sadmica36(denNedeli, 1);
                        Bydny = Sadmica36(denNedeli, 0);
                        break;
                    case 37:
                        Sadmica = Sadmica37(denNedeli, 1);
                        Bydny = Sadmica37(denNedeli, 0);
                        break;
                    case 38:
                        Sadmica = Sadmica38(denNedeli, 1);
                        Bydny = Sadmica38(denNedeli, 0);
                        break;
                    case 39:
                        Sadmica = Sadmica39(denNedeli, 1);
                        Bydny = Sadmica39(denNedeli, 0);
                        break;
                    case 40:
                        Sadmica = Sadmica40(denNedeli, 1);//О закхее
                        Bydny = Sadmica40(denNedeli, 0);
                        break;
                    /*case 41:
                        Sadmica = Sadmica41(denNedeli, 1);//о Мытаре и фарисее
                        Bydny = Sadmica41(denNedeli, 0);
                        break;
                    case 42:
                        Sadmica = Sadmica42(denNedeli, 1);
                        Bydny = Sadmica42(denNedeli, 0);
                        break;
                    case 43:
                        Sadmica = Sadmica43(denNedeli, 1);
                        Bydny = Sadmica43(denNedeli, 0);
                        break;
                    case 44:
                        Sadmica = Sadmica44(denNedeli, 1);
                        Bydny = Sadmica44(denNedeli, 0);
                        break;
                    case 45:
                        Sadmica = Sadmica45(denNedeli, 1);
                        Bydny = Sadmica45(denNedeli, 0);
                        break;
                    case 46:
                        Sadmica = Sadmica46(denNedeli, 1);
                        Bydny = Sadmica46(denNedeli, 0);
                        break;
                    case 47:
                        Sadmica = Sadmica47(denNedeli, 1);
                        Bydny = Sadmica47(denNedeli, 0);
                        break;
                    case 48:
                        Sadmica = Sadmica48(denNedeli, 1);
                        Bydny = Sadmica48(denNedeli, 0);
                        break;
                    case 49:
                        Sadmica = Sadmica49(denNedeli, 1);
                        Bydny = Sadmica49(denNedeli, 0);
                        break;
                    case 50:
                        Sadmica = Sadmica50(denNedeli, 1);
                        Bydny = Sadmica50(denNedeli, 0);
                        break;*/
                }
            }
            if (Bydny == null) Bydny = "";
            String nedP;
            switch (denNedeli) {
                case 1:
                    nedP = "//1";
                    break;
                case 2:
                    nedP = "//2";
                    break;
                case 3:
                    nedP = "//3";
                    break;
                case 4:
                    nedP = "//4";
                    break;
                case 5:
                    nedP = "//5";
                    break;
                case 6:
                    nedP = "//6";
                    break;
                default:
                    nedP = "";
                    break;
            }
            count++;
            if (denNedeli == 0) {
                sb.append("\n");
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
            } else {
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
            }
            pasha.add(Calendar.DATE, -1);
            if (i % 7 == 0) {
                nedela--;
                nedela_Nadzel--;
            }
        }

        nedela = 41;
        nedela_Nadzel = 41;
        pasha = new GregorianCalendar(year_ch, pascha_month(year_ch), pascha_date(year_ch), 0, 0, 0);
        pasha.add(Calendar.DATE, -70);
        for (int i = 1; i <= 80; i++) {
            int denNedeli = pasha.get(Calendar.DAY_OF_WEEK) - 1;
            String Sadmica = "", Bydny = "";
            if (denNedeli != 0) {
                switch (nedela) {
                    case 41:
                        Sadmica = Sadmica41(denNedeli, 1);//о Мытаре и фарисее
                        Bydny = Sadmica41(denNedeli, 0);
                        break;
                    case 42:
                        Sadmica = Sadmica42(denNedeli, 1);
                        Bydny = Sadmica42(denNedeli, 0);
                        break;
                    case 43:
                        Sadmica = Sadmica43(denNedeli, 1);
                        Bydny = Sadmica43(denNedeli, 0);
                        break;
                    case 44:
                        Sadmica = Sadmica44(denNedeli, 1);
                        Bydny = Sadmica44(denNedeli, 0);
                        break;
                    case 45:
                        Sadmica = Sadmica45(denNedeli, 1);
                        Bydny = Sadmica45(denNedeli, 0);
                        break;
                    case 46:
                        Sadmica = Sadmica46(denNedeli, 1);
                        Bydny = Sadmica46(denNedeli, 0);
                        break;
                    case 47:
                        Sadmica = Sadmica47(denNedeli, 1);
                        Bydny = Sadmica47(denNedeli, 0);
                        break;
                    case 48:
                        Sadmica = Sadmica48(denNedeli, 1);
                        Bydny = Sadmica48(denNedeli, 0);
                        break;
                    case 49:
                        Sadmica = Sadmica49(denNedeli, 1);
                        Bydny = Sadmica49(denNedeli, 0);
                        break;
                    case 50:
                        Sadmica = Sadmica50(denNedeli, 1);
                        Bydny = Sadmica50(denNedeli, 0);
                        break;
                }
            }
            if (Bydny == null) Bydny = "";
            String nedP;
            switch (denNedeli) {
                case 1:
                    nedP = "//1";
                    break;
                case 2:
                    nedP = "//2";
                    break;
                case 3:
                    nedP = "//3";
                    break;
                case 4:
                    nedP = "//4";
                    break;
                case 5:
                    nedP = "//5";
                    break;
                case 6:
                    nedP = "//6";
                    break;
                default:
                    nedP = "";
                    break;
            }
            count++;
            if (denNedeli == 0) {
                sb.append("\n");
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(chteniaNedelnya(nedela_Nadzel, 0)).append("\", \"cytanne\"=>\"\".$ahref.\"").append(chteniaNedelnya(nedela, 1)).append("</a>\");").append("\n");
            } else {
                sb.append("$calendar[]=array(\"cviaty\"=>\"").append(Bydny).append("\", \"cytanne\"=>\"\".$ahref.\"").append(Sadmica).append("</a>\");").append(nedP).append("\n");
            }
            pasha.add(Calendar.DATE, 1);
            if (i % 7 == 0) {
                nedela++;
                nedela_Nadzel++;
            }
            if (nedela_Nadzel > 50 && denNedeli == 6) break;
        }

        sb.append("?>\n");
        FileWriter outputStream;
        try {
            GregorianCalendar c = (GregorianCalendar) Calendar.getInstance();
            File file = new File("/home/oleg/www/carkva/calendar-cytanne_" + (c.get(Calendar.YEAR) + 1) + ".php");
            outputStream = new FileWriter(file);
            outputStream.write(sb.toString());
            outputStream.close();
        } catch (Exception ignored) {
        }
        return String.valueOf(count);
    }
}
