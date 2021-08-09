import java.util.*

fun main() {

    startMessage()

}

var player = 1

var whowin = 1

fun game() {

    gameloop@
    for (k in 1..2) {

        print(
            "\n$player-ci oyunçu şifrəni daxil edərək oyunu başladır!\n" +
                    "\n" +
                    "Şifrə yalnız aşağıdakı 8 rəngdən ibarət ola bilər!" +
                    "\n" +
                    "1 - Qırmızı, 2 - Yaşıl, 3 - Sarı, 4 - Mavi, 5 - Ağ, 6 - Qara, 7 - Bənövşəyi, 8 - Çəhrayı" +
                    "\n" +
                    "Not: Rənglərin rəqəmlərini boşluq buraxaraq qeyd edin\n" +
                    "\n" +
                    "Şifrə: "
        )


        val password = Array(5) { 0 }

        steps(password)

        if (player == 1) {
            player++
        } else if (player == 2) {
            player--
        }

        println("\n\n\n")

        print(
            "\nIndi isə növbə $player -ci oyunçunundur. 8 Mərhələ  müddətində şifrə qırılmalıdır!\n" +
                    "\n\n\n"
        )


        val step1 = Array(5) { 0 }

        stepname()

        steps(step1)

        winCase(step1, password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step2 = Array(5) { 0 }

        stepname()

        steps(step2)

        winCase(step2, password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step3 = Array(5) { 0 }

        stepname()

        steps(step3)

        winCase(step3, password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step4 = Array(5) { 0 }

        stepname()

        steps(step4)

        winCase(step4, password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step5 = Array(5){0}

        stepname()

        steps(step5)

        winCase(step5,password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step6 = Array(5){0}

        stepname()

        steps(step6)

        winCase(step6,password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step7 = Array(5){0}

        stepname()

        steps(step7)

        winCase(step7,password)

        if (whowin == 2){

            stepnames = 1

            whowin--

            continue@gameloop

        }

        val step8 = Array(5){0}

        stepname()

        steps(step8)

        winCase(step8,password)

    }
}

fun gameRules() {

    println(
        "\nMastermind Oyunu\n" +
                "" +
                "Mastermind, 8 yaşdan yuxarı hər kəsin oynaya biləcəyi, düşünmə və problem həll etmə bacarıqlarını artıran 2 oyunçulu bir oyundur.\n" +
                "" +
                "Oyunun məqsədi rəqibin təyin etdiyi şifrəni sındırmaqdır.\n" +
                "\n" +
                "Mastermind Oyununun məzmunu\n" +
                "" +
                "Oyunun məzmununa bir oyun sahəsi, 8 fərqli rəngli böyük piyada daxildir. " +
                "\n" +
                "Parolu təyin etmək və sındırmaq üçün böyük piyonlar istifadə olunur.Bu piyonları ən çox 8 mərhələ olmaqla istifadə edirsiniz.\n" +
                "\n" +
                "Mastermind necə oynanılır?\n" +
                "" +
                "Oyunçulardan biri 5 böyük piyonu rəqibinə göstərmədən öz meydanına qoyaraq parol yaradır. Rəqib oyunçu bu şifrəni pozmaq üçün oyun sahəsinə" +
                "\n" +
                "təsadüfi 5 böyük piyada qoyur. Piyadalardan hər hansı birinin rəngi düzgündürsə, amma yeri səhvdirsə, oyun sahəsində sizə yerin yalnış olduğu bildirilir, " +
                "\n" +
                "rəng və yer düzgündürsə, sıra və rəngi düzgün tapdığınız bildirilir. Ancaq oyunçu hansı piyonun doğru olduğunu bilmir. " +
                "\n" +
                "Yalnız neçə piyonunun doğru olduğunu aşkar edə bilər. " +
                "\n" +
                "Növbəti hərəkətində istədiyi piyada dəyişikliklər edir və şifrəni təyin edən şəxsin verdiyi cavablara görə düzgün piyonları təyin etməyə çalışır.\n" +
                "" +
                "Şifrəni dəqiq bildiyiniz zaman, bunun neçə mərhələdə olduğu yoxlanılır və növbə digər oyunçuya keçir. " +
                "\n" +
                "Hansı oyunçu rəqibinin şifrəsini az hərəkətlə sındıra bilərsə, oyunu qazanır." +
                "\n" +
                "Daha çox məlumat üçün: https://www.egitimdizayn.com/mastermind-oyunu1"
    )

    println("\nQaydalarla tanış oldunusza 'Enter' düyməsinə basın...")
    val empty = readLine()

    println(
        "\nOyuna başlamağa hazırsınız?" +
                "\n" +
                "1 - Bəli" +
                "\n" +
                "2 - Oyunu tərk etmək" +
                "\n" +
                "Cavab: "
    )

    val startGame = readLine()?.toInt()

    when (startGame) {
        1 -> game()
        2 -> println("Oyun bitdi!")
        else -> println("Yalnızca 1 və 2 düymələrini seçə bilərsiniz!")
    }

}

fun startMessage() {

    println("Mastermind oyununa xoş gəlmisiniz!\n")

    print(
        "Oyunun qaydalarını bilirsiniz?" +
                "\n" +
                "1 - Bəli" +
                "\n" +
                "2 - Xeyr" +
                "\n" +
                "Cavab: "
    )

    when (readLine()?.toInt()) {

        1 -> {
            println("\nOyuna başlıyırıq!\n"); game()
        }
        2 -> gameRules()
        else -> println("Yalnızca 1 və 2 düymələrini seçə bilərsiniz!")
    }

}

fun steps(step: Array<Int>) {

    val read = Scanner(System.`in`)

    for (j in 0..4) {

        step[j] = read.nextInt()
        if (step[j] <= 0 || step[j] >= 9) {
            println("Rənglərə uyğun olaraq yalnız 1-dən 8-ə qədər olan rəqəmləri seçə bilərsiniz!")
            System.exit(0)
        }

    }

}

var stepnames = 1

var same = 0

var counting = 1

var playerwin1 = 0
var playerwin2 = 0

fun winCase(steps: Array<Int>, password: Array<Int>) {

    var count = 0
    same = 0
    var temp = 0

    for (i in 0..4) {

        if (steps[i].equals(password[i])) {

            same++

            temp = steps[i]

        }
    }

    winloop@
    for (i in 0..4) {


        winloop1@
        for (j in 0..4) {

            if (password[j].equals(steps[i])) {

                if(password[j] == temp){

                    continue@winloop1

                }

                if(steps[i].equals(password[i])){

                    continue@winloop1

                }

                count++

                continue@winloop

            }

        }
    }

    if(same in 0..4){

        println("\nSən $same rəngi və sırasını düz tapdın.\n")

    }


    when (counting) {
        1 -> {
            playerwin1 = stepnames;
            playerwin1--
        }
        2 ->{
            playerwin2 = stepnames
            playerwin2--
        }
    }


    if (same == 5) {



        println("\nSən $same rəngi və sırasını düz tapdın.\n")

        when (counting) {
            1 -> {
                println("Şifrə $playerwin1 mərhələdə tapıldı")
            }
            2 -> println("Şifrə $playerwin2 mərhələdə tapıldı\n")

        }


        whowin++



        if(counting == 2) {

            if (playerwin1 < playerwin2) {
                println("2-ci oyunçu qalib gəldi")
            } else if(playerwin2 < playerwin1){
                println("1-ci oyunçu qalib gəldi")
            } else {
                println("Oyunçulardan heç biri qalib gəlmədi.")
            }
            System.exit(0)
        }

        counting++



    }

    if (same < 5 && count > 0) {
        println("Sənin $count rəngin düz olsada, sırası yalnışdır.\n")
    }


    if(stepnames == 9 && same != 5){

        println("Şifrə sındırılmadı. Şifrə ${password.joinToString(" ")} idi\n")

        if(playerwin2 >= 8 && playerwin1 < 8){

            println("2-ci oyunçu qalib gəldi")

        }

        if(counting == 2 && playerwin1 == 8){

            println("Oyunçulardan heç biri qalib gəlmədi.")

        }

        counting++

    }


}

fun stepname() {

    if(stepnames == 9){

        stepnames = 1

    }

    print(
        "Mərhələ $stepnames\n" +
                "Şifrəni qırmaq üçün 5 rəngi rəqəmlərinə uyğun olaraq tapmalısınız!\n" +
                "1 - Qırmızı, 2 - yaşıl, 3 - sarı, 4 - mavi, 5 - ağ, 6 - qara, 7 - bənövşəyi, 8 - çəhrayı\n" +
                "\n" +
                "Şifrə: "
    )

    stepnames++


}