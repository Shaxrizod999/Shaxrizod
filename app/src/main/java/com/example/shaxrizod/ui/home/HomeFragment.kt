package com.example.shaxrizod.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shaxrizod.R
import com.example.shaxrizod.adapters.RecyclerAdapter
import com.example.shaxrizod.databinding.FragmentHomeBinding
import com.example.shaxrizod.models.Place

class HomeFragment : Fragment(), RecyclerAdapter.OnClick {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.rv.adapter = RecyclerAdapter(initList(),this)
        return binding.root
    }
    private fun initList(): List<Place>{

        val list = ArrayList<Place>()

        for (i in 1..100) {
            list.add(
                Place(
                    "Qashqadaryo viloyati",
                    "Qashqadaryo",
                    R.drawable.qashqadaryo,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "QASHQADARYO VILOYATI TARIXI.\n" +
                            "\n" +
                            "Qashqadaryo vohasida miloddan avvalgi asrlarda vujudga kelgan, yoshi jahonning eng qadimgi manzillari bilan bo’ylashadigan shaharlar bor. Shahrisabz va Qarshi ana shunday shaharlardandir. Shahrisabz va Qarshining 2700 yillik yubileylari nishonlanishi va ularning ulug’ yoshi jahon miqyosida tan olinib, hukumatimiz qaroriga muvofiq bayram sifatida tantana qilingani fikrimizning yorqin isbotidir.\n" +
                            "\n" +
                            "Qarshi shahrining kechmishi qadimiy Yerqo’rg’on, Zahhoki Moron, Nasaf (Naxshab) – Shulluktepa manzillarida o’tgan. Arxeologlarning ma’lumotlariga qaraganda, Qarshi vohasida birinchi shahar hozirgi qarshi shahridan shimolda joylashgan qadimgi Yerqo'rg’onda miloddan avvalgi VI-II asrlarda shakllangan. Eramizdan avvalgi VI-II asrlarda u ikki qator devor bilan o’ralgan va maydoni 150 gektar (tanob)ni tashkil etgan.\n" +
                            "\n" +
                            "Qarshi vohasi markazining tarixi Bobil (Iroq), Aleksand¬riya (Misr), Yerevan (Armaniston), Taksila (Pokiston) kabi qadimgi shaharlar rivojiga o’xshashdir. Chunonchi, VI asrda Turk hoqonligi va Eron Sosoniylari tomonidan Eftalitlar imperiyasiga qarshi olib borilgan janglarda Yerqo’rg’on yonib, vayronaga aylangan. Shundan so’ng, Qarshi vohasi poytaxti Yerqo’rg'onning Janubiy-G’arb tomonidagi Qashqadaryoning Janubiy sohili bo’yida, hozirgi Shulluktepa o’rnida qad ko’taradi. U tarixda Naxshab (arabcha - Nasaf) nomi bilan ma’lum va mashhur.\n" +
                            "\n" +
                            "Naxshab XIII asrda Chingizxon bosqinchilari tomonidan vayron qilingach, voha markazi uchinchi marotaba hozirgi Qarshining eski shahar qismi o’rnida qayta tiklangan. Shu tariqa Yerqo’rg'on, Naxshab va Qarshi shaharlari Qarshi voxasi markazining taraqqiyot bosqichlarini o’zida mujassam etgan. Yerqo’rg'on va Zahhoki Moron (m.a. II-I asrlar)da arxeologlar tomonidan topilgan ko’hna ashyolar o’zbek xalqining ajdodlari eng qadimgi zamondan o’troq hayot kechirib, davlat tuzumi asosida shahar madaniyatini yaratganligini va hunarmandchilik, san’at rivojlanganligini tasdiqlaydi.\n" +
                            "\n" +
                            "Nasaf IX-XII asrlarda Janubiy Sug’dning asosiy shaharlaridan hisoblangan. Unda rabot, shahriston, karvonsaroylar, masjid va madrasalar mavjud bo’lgan.Manbalarda Nasafning Boyon guzarida buyuk muhaddis Imom Buxoriy istiqomat qilganligi, Nasafda xadisshunoslik maktabi faoliyat ko’rsatganligi va bu shahar IX-X asrlarda o’ziga xos ilmiy-madaniy markazlardan biri darajasiga ko’tarilganligi qayd etilgan. Mazkur shaharda turli davrlarda 200 dan ziyod Nasafiylar yashab, ijod etgan. \n" +
                            "\n" +
                            "Istiqlol tufayli O‘zbekistonda madaniy merosga nisbatan munosabat ijobiy tomonga o‘zgardi. Samarqand, Buxoro, Xiva, Termiz, Shahrisabz kabi qadimiy shaharlarning qutlug‘ yubileylari o‘tkazilib, ulardagi umumbashariy madaniyatning bebaho durdonalari bo‘lgan me’moriy obidalar qayta tiklandi. Xuddi shunday navbat o‘zining boy tarixi va madaniy merosiga ega bo‘lgan Qarshi shahriga ham yetib keldi va shahar yubileyi nishonlandi.\n" +
                            "\n" +
                            "Qarshining hozirgi kungacha saqlangan me’moriy yodgorliklari - Ko‘kgumbaz, Qashqadaryo ko‘prigi, Qarshi hammomi, Sharofboy, Bekmurodboy, Qilichboy, Abdulazizboy madrasalari, Odina jome’ masjidi, Qarshi sardobasi, Abu Ubayda bin al-Jarroh ziyoratgoxi va Xonaqo masjidi majmuasi hukumatimiz va xalqimiz ardog‘ida.\n" +
                            "\n" +
                            "Qarshi shahridagi Ko‘kgumbaz masjidi, Qashqadaryo ustiga qurilgan g‘ishtko‘prik, qadimiy hammom va madrasalar o‘zbek me’morchiligining noyob namunalaridan bo‘lib, ularning har biri o‘z tarixiga ega. Bu obidalar O‘zbekistondagi ko‘plab tarixiy-madaniy yodgorliklar kabi yuksalishi ulug‘vorlik davrlarini ham, e'tiborsizlik va tahqirona tazyiqlarni ham, vayrongarchilik va tushkunlik holatlarini ham boshidan kechirgan. Tarixiy lavha\n" +
                            "\n" +
                            "Hozirgi O’zbekistonning Qashqadaryo viloyati qadimgi so’g’d vohasining unumdor dehqonchilik hududini egallagan bo’lib, qadimda o’z suvlarini Amudaryoga quyuvchi Zarafshon va Qashqadaryo daryolari oralig’ida, movarounnahrning qoq markazida joylashgan. Movarounnahrning barcha tarixiy rivojlanish bosqichlari ushbu viloyat bilan chambarchas bog’liqdir. Kitob va Shahrisabzda joylashgan qadimgi shaharlarda olib borilgan qazish ishlari davomida arxeologlar tomonidan topilgan xilma xil moddiy boyliklar va tangalar silsilasi antik so’g’diyonaga xos bo’lgan boy madaniyatdan dalolat beradi. Antik davrdan keyingi ilk asrlardagi mustaqil davlatlar hisoblanmish Kitob, Zahoki Maron va Qarshi yaqinidagi Yerqo’rg’on shaharlari tarixiy qatlamlarda yorqin iz qoldirgan. Yangi eraning V asriga kelib esa antik shaharlarning tanazzulga yuz tutishi kuzatiladi. IV-VII asrlarda birin-ketin ilk feodallarning mustahkam qal’alari paydo bo’la boshladi. (Muddintepa, Sho’rtepa, Shulluktepa va boshqalar shular jumlasidandir). Arxeologik qazishmalar mobaynida IV-VII asrlarda mavjud bo’lgan Kadjartepa, Tog’aytepa, Ko’xnafazli shaharchalarining qoldiqlari topildi. Shu vaqtda Kesh viloyati (Kitob va Shahrisabz) va Naxshab (hozirgi Qarshi shahri) turk hoqonligi davlatining to’qqiz federatsiyasi tarkibiga kirardi. Ular muxtoriyat hisoblanar hamda Samarqandda hukmronlik qiluvchi hoqonga hiroj to’lardi.\n" +
                            "\n" +
                            "O’sha vaqtdagi shaharlarda loydan qurilgan qalin devorlar, ularda qo’riqlash uchun baland minoralar va mustahkam darvozalar, ba’zi shahar darvozalarida esa mustahkam qulflar mavjud edi. Shahar hududi gavjum aholi yashaydigan ijtimoiy - madaniy markaz hisoblanardi.",
                    38.86662135111598,
                    65.8002461832504
                )
            )
            list.add(
                Place(
                    "Ko'kgumbaz",
                    "Shahrisabz, Oʻzbekiston",
                    R.drawable.kokgumbaz,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "  Shayboniylar sulolasidan biri Abdulloxon II Qashqadaryo yerida musulmonlar uchun muborak maskan barpo etdi. Bu maskan odamlar qalbiga ezgulik va yaxshilik urug‘larini sochib turadi. Bu zamin otalarimiz va bobolarimizni eslatib, ularning qilgan xayrli va savobli ishlaridan darak beradi. Unda yashayotgan xalq tinchlikni yaxshi ko‘radi va g‘oyat mehnatsevardir.\n" +
                            "    Qarshi qo‘rg‘onining markazida qurilgan Abdullaxon madrasasi uzoq vaqtlar shaharning ko‘rki bo‘lib ana shu muqaddas tabarruk dargohni qurishni loyiq ko‘rdi. Bu masjid namozgoh (Ko‘k–gumbaz) hijriy yil hisobi bilan 999 yildan buyon mavjud. Uning gumbazi moviy koshinlar bilan qoplangani uchun xalq orasida \"Ko‘k–gumbaz\" nomini oldi. Namozgohning qisman saqlanib qolgan peshtoqidagi sirlangan koshinlarga bitilgan yozuvda bu inshoot Abdullaxon II–ning farmoni bilan 1590–1591 yillarda qurilgani qayd etilgan.\n" +
                            "     Abdullaxon II davrida Qarshi yana eski shahar markazida qurilgan Bikibiy madrasasi binosi, pishiq g‘ishtdan besh gumbazli imorat shaklida oldi ayvonli qilib qurilgan. \"Ko‘k–gumbaz\" namozgohi besh vaqt namoz va juma namozi o‘qiladigan masjidlardan farq qiladi. Bu joyda Ramazon va Qurbon hayiti namozlari o‘qilgan. Shuning uchun bunday masjidlarni “Namozgoh” yoki “Musallo” deb atalgan.\n" +
                            "     Odatda namozgohlar shaharlarda, ba’zan aholisi zich joylashgan yirik qishloqlarda qurilgan, bayram ibodatlarida bu joylarga katta miqdorda xalq yig‘ilgan. Shu boisdan ular shahar ichida emas, balki shahar atrofida keng maydonda barpo etilgan.\n" +
                            "     Yana shuni ta’kidlash kerakki, O‘rta Osiyoda XII–XVI asrlardan bizgacha saqlangan namozgohlar soni juda oz. Shuning uchun Qarshidagi namozgoh O‘rta Osiyo me’morchiligida bizgacha yetib kelgan noyob yodgorlik sifatida ham qadrlidir.\n" +
                            "     O‘tgan asrning oltmishinchi yillariga qadar «Ko‘k–gumbaz» masjidi o‘sha davrdagi siyosiy tuzum tomonidan yopib qo‘yilgan edi. Albatta, Allohning dargohini ziyorat qilishni man qilish mumkin, lekin odamlar qalbidan xudoga ishonishni qanday chiqarib tashlash mumkin, axir ular yaratgandan kuch–quvvat, ma’naviy oziq olib, inqilob va urush davridagi og‘ir kunlarni, urushdan keyingi mashaqqatlarni mardonavor yengdilar, ruhan baquvvatliklarini namoyish etdilar.\n" +
                            "    1953 yildan boshlab «Ko‘k–gumbaz» juma namozlarini o‘qish uchun jome masjid sifatida yana faoliyat ko‘rsata boshladi. Bundan tashqari, Qarshi shahrida 1924 yilgacha O‘rta masjidda, 1928 yilgacha «Charmgar» masjidida, 1930 yilgacha «Odina» masjidida va «Qizil» masjidlarda ham juma va besh vaqt namozlar o‘qib kelingan.\n" +
                            "     Bu masjidda 1860, 1889 va 1921 yillarda ta’mirlash va qayta qurish ishlari olib borilgan. Bu ishlar keyin ham davom ettirildi. Xususan, 1967 yilda masjid gumbazi shahrisabzlik usta Hamdam tomonidan tiklandi. 1982 yilda samarqandlik usta–naqqosh Nusratillo Asadov tomonidan ko‘k sirli koshin bilan Qur’onning \"Mulk\" surasidan oyatlar nozik did bilan yozildi va gumbaz tepasiga oltin rangli qubba o‘rnatildi.\n" +
                            "    1996 yilda Sohibqiron Amir Temur bobomizning 660 yilligi munosabati bilan o‘tmish yodgorliklaridan bir qanchasini tiklash va qayta ta’mirlash ishlari o‘tkazildi. Shu jumladan, «Ko‘k–gumbaz» masjidida obodonlashtirish ishlari amalga oshirildi.\n" +
                            "     2006 yilda \"Kuk–gumbaz\" me’moriy majmuasi Yurtboshimiz farmoni va tashabbuslari bilan qayta ta’mirlandi va hozirgi ko‘rinishdagi asl qiyofasiga ega bo‘ldi.",
                    39.10528805610784, 66.81919096648849
                )
            )
            list.add(
                Place(
                    "Qashqadaryo ko'prigi",
                    "Qarshi, Oʻzbekiston",
                    R.drawable.koprik,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Pishiq g‘ishtdan ravoqli ko‘prik qurish tajribasi O‘rta Osiyoda ilgaridan rasm bo‘lgan, ilk o‘rta asrlar davriga kelib u ancha takomillashtirilgan. Bizgacha etib kelgan ko‘hna ko‘priklar XVI asrning ikkinchi yarmiga taalluqli bo‘lib, ular orasida Qashqadaryo ustida qurilgan ko‘prik eng katta hisoblanadi.\n" +
                            "\n" +
                            "Daryo o‘zanini kesib o‘tgan, g‘ishtdan qurilgan ko‘prikning o‘n ikkita mustahkam pillapoyasi oyoqlari keng va past ravoqlar orqali tutashtirilgan. Ko‘prikning uzunligi - 122 metr, eni - 8.2 metr, daryo tubidan o‘rtadagi yul qoplamigacha bo‘lgan balandligi - 5.35 metr. Ko‘prikning har ikki tomonidagi ravoqlar oralig‘idagi pillapoyalar juda baquvvat silindirsimon, g‘ishtli tirgovichlar bilan mustahkamlangan. Uning asosi pastga tomon kengaytirib borilgan, har birining diametri qariyb 4 metr keladigan burjlarga birlashtirilgan. Maromi bilan terilgan g‘ishtin burjlar qatori, ravoqning chuqur jar tepasida ekanligi, ko‘prikning ustki tuzilishi chidamli, puxta inshootning me’moriy qiyofasidan darak beradi.\n" +
                            "\n" +
                            "Daryo o‘zanining kengaytirilganligi sababli ko‘prik 1914 yilda qayta qurilgan. Qirg‘oqning chetki kuhna pillapoyalari yangilangan. Ko‘prikning ikki tomoniga qorovulxonalar qurilgan. Bu bajarilgan ishlar g‘isht plitaga yozib quyilgan. Rivoyatda Qashqadaryo ko‘prigining qurilishini Abdullaxon II ga nisbat beriladi.",
                    38.88688079626978, 65.80965071259752
                )
            )
            list.add(
                Place(
                    "Qashqadaryo viloyat oʻlkashunoslik muzeyi",
                    " Qashqadaryo viloyati\n" +
                            "Shahar: QARSHI\n" +
                            "ESKI SHAHAR ko'chasi, 3-chi dahasi, 1",
                    R.drawable.qashqadaryo,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Qashqadaryo viloyat oʻlkashunoslik muzeyi — madaniy-maʼrifiy muassasa. 1975 yilda Qarshi shahrida tashkil etilgan. Muzeyda tarix, xalq amaliy sanʼati, tabiat, xotira va qadriyat boʻlimlari bor. Muzey fondida 20 mingdan ziyod numizmatika, arxeologiya, tasviriy va amaliy sanʼat asarlari, tarixiy hujjatlar, nodir qoʻlyozmalar, kitoblar, maishiy va etnografiyaga oid eksponatlar mavjud (2005). Muzey ilmiy tekshirish ishlari olib boradi, fondini boyitadi, kitob, kataloglar nashr etadi; jumladan, Rimda fransuz tilida chop etilgan \"Qarshi oʻlkashunoslik muzeyidagi sharq qoʻlyozmalari katalogi\" (2004, 50 dan ortiq qoʻlyozmalar haqida maʼlumotlar bor) va boshqalar Mustaqillik yillaridan Qashqadaryo iqtisodiy-ijtimoiy va madaniy hayoti sohasida qoʻlga kiritilgan yutuqlar, fan taraqqiyotini namoyon etuvchi eksponatlar bilan boyitilmoqda.\n" +
                            "\n" +
                            "Muzey noyob kartinalar toʻplami hamda nodir qoʻlyozma kitoblarga ega. Mas, nodir qoʻlyozmalar orasida Taftazoniyning \"Taxziyb almantiq valkalom\" asariga, Nasafiyning \"Aqoid anNasafiy\" asariga yozilgan sharhlar va boshqalar.",
                            39.10528805610784, 66.81919096648849
                )
            )
            list.add(
                Place(
                    "Ko'kgumbaz",
                    "Shahrisabz, Oʻzbekiston",
                    R.drawable.qashqadaryo,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "",
                    39.10528805610784, 66.81919096648849
                )
            )
            list.add(
                Place(
                    "Shaxrisabz",
                    "Qashqadaryo viloyati Shaxrisabz tumani",
                    R.drawable.shaxrisabz,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Shahrisabz tumani - Qashqadaryo viloyatidagi tuman. 1926 yil 29 sentyabrda tashkil etilgan. Shimolidan Kitob tumani, sharqdan Tojikiston, Surxondaryo viloyati, janubidan Yakkabogʻ, Qamashi, gʻarbdan Chiroqchi tumanlari bilan chegaradosh. Maydoni 1,70 ming km². Aholisi 272,4 ming kishi (2004). Tumanda 1 shahar (Shahrisabz): 1 shaharcha (Miroqi), 12 ta qishloq fuqarolar yigʻini (Dukchi, Kunchiqar, Moʻminobod, Naʼmaton, Oqsuv, Toʻdamaydon, Xitoy, Shakarteri, Shamaton, Oʻzbekiston, Qutchi, Hisorak) bor. Markazi — Shahrisabz shahriTabiati. Tuman hududi Qashqadaryo viloyatining shimoli-sharqiy qismida, Hisor togʻlarining etaklarida joylashgan. Tumanning gʻarbi ochiq voha — Qarshi choʻliga tutashib ketadigan tekislikdan iborat. Togʻlardan oqib tushadigan Oqsuv, Qashqadaryo, Tanxozdaryo, Qizildaryo, Tamshush, Miroqi daryolari jarliklar hosil qilgan. Miroqi togʻ etaklaridan qora marmar qazib olinadi. Iqlimi kontinental. Yillik oʻrtacha temperatura 14,7°. Yanvarning oʻrtacha temperaturasi 0,8°, eng past temperatura —26°.[1]\n" +
                            "\n" +
                            "Iyulning oʻrtacha temperaturasi 28°, eng yuqori temperatura 43°. Iiliga 545 mm yogʻin tushadi. Vegetatsiya davri — 219 kun.\n" +
                            "\n" +
                            "Tuproqlari boʻz, jigarrang va qoʻngʻir togʻoʻrmon tuproqlari. Yovvoyi oʻsimliklardan qoʻngʻirbosh, rang, shuvoq, oqquray, pashmak, shoʻra, bugʻdoyiq, kovrak, qargʻaoyoq, qamish, yulgʻun, yantoq, togʻ yon bagʻirlarida archa, doʻlana, togʻolcha, chinor oʻsadi. Yovvoyi hayvonlardan qobon, boʻri, ayiq, jayran, qoʻshoyoq, yumronqoziq, jayra va boshqalar uchraydi.\n" +
                            "\n" +
                            "Aholisi, asosan, oʻzbeklar; shuningdek, tojik, tatar, rus va boshqalar millat vakillari ham yashaydi. Aholining oʻrtacha zichligi 1 km²ga 160,2 kishi. Shahar aholisi 98 ming, qishloq aholisi 174,4 ming kishi (2004).\n" +
                            "\n" +
                            "Xoʻjaligi. Tuman xoʻjaligi, asosan, qishloq xoʻjaligiga ixtisoslashgan. Shahrisabz tumanida 9 qoʻshma korxona, kichik korxonalar, 1300 ga yaqin xususiy korxona, 14 shirkat korxonasi, 19 aksiyadorlik jamiyati mavjud. Qishloq xoʻjaligining yetakchi tarmogʻi paxtachilik. Shuningdek, gʻallachilik, chorvachilik, pillachilik ham rivojlangan. Qishloq xoʻjaligida sugʻoriladigan yerlar 18 ming ga, shu jumladan, 5,8 ming ga yerga paxta, 2,0 ming ga yerga sabzavot va poliz, 2,0 ming ga yerga beda, 0,3 ming ga yerga kartoshka ekiladi. 3,4 ming ga yer bogʻ. Tumanda 12 shirkat xoʻjaligi, 4 ta xoʻjaliklararo korxona, 478 ta fermer xoʻjaligi bor (2004). Hisorak suv ombori qurilgan. Tuman shirkat va shaxsiy xoʻjaliklarida 52,7 ming qoramol, 51,6 ming qoʻy va echki, 800 dan ziyod yilqi, 177,5 ming parranda boqiladi.\n" +
                            "\n" +
                            "2003/04 oʻquv yilida 109 ta umumiy taʼlim maktabida 69 ming oʻquvchi taʼlim olgan. Tuman hududida 11 ta klub, 11 ta madaniyat uyi, madaniyat va istirohat bogʻi, muzey, 60 kutubxona tarmogʻi, 2 stadion mavjud. Tumandagi 14 ta kasalxona, 8 poliklinika, 18 ta qishloq vrachlik ambulatoriyasi, 13 qishloq vrachlik punktida 775 vrach, 3,5 ming oʻrta tibbiy xodim ishlaydi.\n" +
                            "\n" +
                            "Tuman hududi orqali Toshkent—Kitob poyezdi oʻtadi. Shahrisabz bilan Toshkent, Samarqand, Buxoro, Qarshi, Termiz, Denov oʻrtasida va Shahrisabz bilan Hazora, Shamaton, Qoraloycha qishloqlari orasida avtobuslar qatnaydi. Tumandagi asosiy meʼmoriy yodgorliklar Shahrisabzda joylashgan. 1931 yildan tuman \"Kesh\" gaz. nashr etiladi (adadi 2182).",
                    39.061589325538534, 66.82914659507989
                )
            )
            list.add(
                Place(
                    "Kitob",
                    "Qashqadaryo viloyati Kitob tumani",
                    R.drawable.kitob,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Kitob tumani - Oʻzbekiston Respublikasining Qashqadaryo viloyatidagi tuman. Viloyatning shimoli-sharqida. 1926 yil sentabrda tashkil etilgan. 1962 yil 24 dekabrda Shahrisabz tumani bilan birlashtirilgan. 1968 yil 25 dekabrda qayta toʻzildi. Viloyatning Chiroqchi, Shahrisabz tumanlari, Samarqand viloyati va Tojikiston bilan chegaradosh. Maydoni 1,75 ming km². Aholisi 178,9 ming kishi (2000). Kitob tumanida 1 shahar (Kitob) va 12 ta qishloq fuqarolari yigʻini (Bektemir, Beshterak, Bogʻbon, Makrid, Palandara, Paxtaobod, Sivaz, Toʻpchoq, Qaynarbuloq, Katorbogʻ, Quynoqboy, Jilisuv) bor (2000). Markazi — Kitob shahri Tuman hududidan Katta Oʻzbekiston trakti oʻtgan. Taxtaqoracha dovoni (balandligi 1788 m) esa respublika janubini shimoliy viloyatlar bilan bogʻlaydi.\n" +
                            "\n" +
                            "Tabiati. Hududining katta qismini shimoliy va sharqiy chegaralar boʻylab choʻzilgan baland Hisor va Zarafshon togʻlari (4000 m) egallagan. Baland togʻlar tuman hududini sovuq havo oqimidan toʻsib turgani uchun tuman iqlimi viloyatda eng moʻʼtadil. Oʻrtacha temperatura yanvar da 0,8°, iyulniki 28°. Yiliga oʻrtacha 545 mm yogʻin toʻshadi. Yogʻinning 85% ba-hor va qish fasllariga toʻgʻri keladi. Tuman hududidan Kashqadaryoning irmoqlari — Kichikjar, Oqsuv, Jinnidaryo, Oqsaryo oqib oʻtadi. Tuprogʻi Shahrisabz-Kitob botigʻida tipik boʻz, daryo boʻyida allyuvial boʻz, togʻlarda qoʻngʻir tuproq. Efemer oʻsimliklar hamma joyda uchraydi. Suv boʻylarida qamish, yulgʻun oʻsadi. Togʻ yon bagʻirlarida archa, bodom, doʻlana, olma, tol, yongʻoq, pista, zarang daraxtlari va xilma-xil butalar oʻrmon hosil qilgan. Togʻ yon bagʻirlari chorva mollari uchun yozgi yaylov. Tulki, boʻri, chiyaboʻri, boʻrsiq, ayiq, qobon, togʻ echkisi, arhar; sudraluvchilar; kaklik, chil, bulbul va boshqa yashaydi.\n" +
                            "\n" +
                            "Aholisi, asosan, oʻzbeklar; tojik, rus, tatar va boshqa ham yashaydi. Axrlining oʻrtacha zichligi 1 km² ga 102 kishi. Shaharliklar 34,9 ming kishi, qishloq aholisi 144 ming kishi (2000).\n" +
                            "\n" +
                            "Xoʻjaligi. Kitob tumani qadimdan muhim savdo yoʻllarining ustida joylashganligi va Samarqand, Buxoro hamda Shahrisabzga yaqinligi uchun dehqonchilik va hunarmandchilik rivojlangan hududlaridan biri boʻlgan. Tuman xoʻjaligining asosini dehqonchilik va chorvachilik tashkil qiladi. Qishloq xoʻjaligida sugʻoriladigan yerlar 18,7 ming ga, shu jumladan, 3,3 ming ga yerga paxta, 10,1 ming ga yerga don ekinlari, qolgan yerlarga sabzavot-poliz, kartoshka, yemxashak ekinlari ekiladi. 5,0 ming ga yaqin maydon bogʻ va tokzor. Chorvachilikda qoramol, qoʻy va echki boqiladi. Paxta tozalash va vino zavodlari faoliyat koʻrsatmoqda. Tumanda 90 umumiy taʼlim maktabi, 2 litsey-internat, 2 kasbxunar kolleji, 53 kutubxona, 15 qishloq klubi, Shon-shuhrat muzeyi, stadion va tennis kortlari bor. Tuman markaziy kasalxonasi, 79 qishloq feldsher-akusherlik shohobchasi, 15 qishloq vrachlik amboʻlatoriyasi, 75 qishloq vrachi punkti, dorixonalar mavjud boʻlib, 2300 ga yaqin oliy va oʻrta maʼlumotli tibbiy xodim ishlaydi (2000). 1935 yildan \"Kitob tongi\" tuman gaz. chiqadi (adadi 1000). Tumanda Kitob balandtogʻ rasadxonalar majmuasi faoliyat koʻrsatadi.[1]",
                    39.11888395912628, 66.87352108770544
                )
            )
            list.add(
                Place(
                    "Langar Ota Ziyoratgohi",
                    "Qashqadaryo viloyati Qamashi tumani",
                    R.drawable.langar,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Langar-Ota yoki Yangi Langar — langarlarning ikkinchisi Qashqardaryo viloyatining Chiroqchi tumanida joylashgan.\n" +
                            "\n" +
                            "“Avliyo”larning oddiy xalqqa mo‘’jizaviy yordami haqida afsona bor. Mazkur afsona “Langar-ota” marosimlar joyi bilan bog‘liq bo‘lib,mashhur shayx Ahmad Yassaviy islom diynini qabul qilishni istamagan qishloq aholisiga to‘r tashlab, uni osmonga otgan.\n" +
                            "\n" +
                            "Langar otaning boshqa shayhi o‘zining hassasi bilan to‘rni tutib olib, ularning dinni qabul qilish haqidagi murojaatini qabul qilgan va ularni dinga yo‘naltirgan. Shundan buyon Langar ota ularning muqaddas qarorgohiga aylangan.\n" +
                            "\n" +
                            "Masjid qurilishiga turli xil qabilala o‘z hissalarini qo‘shganlar. Barmoq” sulolasi qo‘y olib kelgan, “Quduchi” sulolasi esa qurilishlarga yordam bergan. Barmoq sulolasining chorva mollari tugab, birgina echkisi qoladi va shayohdan so‘nggi jonzodni so‘yish uchun ruhsa so‘rashadi. Shunda shayh orqaga qaramasdan, bu echkini uning huzuriga olib kelishlarini aytadi, zero shunda Alloh ularga yordam qo‘lini cho‘zadi. Qabiladan bir kishi echkini sudrab kelayotganda bir qancha qo‘y va echkilar unga ergashib keladi. Kutilmaganda shayton podachining qulog‘iga to‘da orasida bo‘ri yurgani haqida shivirlaydi. Podachi ortga qaraydi va to‘da ham to‘xtaydi. Shunday qilib, u shayh so‘zini bajarmaydi va poda to‘kinchiligini to‘xtatib qo‘yadi.\n" +
                            "\n" +
                            "Hazrati Langar ota ziyoratgohi — bu muqaddas qarorgoh, dafn etish va xotira mujmuasi. U Qashqadaryo viloyati Chiroqchi tumani, Chiroqchi shahridan shimolga 45 km masofada Zarafshon tog‘ tizmasida Langar qishlog‘ida joylashgan.\n" +
                            "\n" +
                            "Qadimiy an’analarga ko‘ra ziyorat qilish “Qadamjo” izlaridan boshlangan.\n" +
                            "\n" +
                            "Mazkur qurilish bizning davrlarga kelib, “Xudoning qo‘li” nomli toshni yog‘ingarchiliklardan himoyalash maqsadida bir boy inson tomonidan qurilgan.\n" +
                            "\n" +
                            "Bu ma’jizaviy yerni, go‘yo ikkita yog‘och burama zambaraklarda qo‘riqlayotganday. \n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Toshga qancha qaramaylik, ishlov berilganlik izlari topilmaydi. Bunday izlar xamirda ham bo‘ladi, lekin toshda uchratish kamdan-kam holdir. Qadim zamonlarda shoh, xon va mansabdorlar otlariga minib, mazkur qadamjoga tashrif buyurishgan va shu yerdan ziyorat joyiga qadar oyoq yalang borishgan.\n" +
                            "\n" +
                            "15 asr oxiri, 16 asr boshlarida Ashtarxoniylar davlati tomonidan ikkita maqbara — Shayh Abul Xasan Ishqiy hamda Langar ota avlodi yotgan yerlarga dengiz sathidan 1000 metr balandlikda qurilgan.\n" +
                            "\n" +
                            "Mazkur maqbaralar kim tomonidan qurilganligi va kim uchun qurilganligi haqida hech qanday yozma manbaalar maqjud emas. Lekin qabr tepasidagi yozuvchlar bu yerga juda ilgari shayhlar ko‘milganligini ko‘rsatadi.\n" +
                            "\n" +
                            "Sovet ittifoq davrida hokimiyat bu yerlarni qayta ta’mirlashga harakat qilishganligi ko‘rinib turibdi.\n" +
                            "\n" +
                            "Suratlar Shayh Langar ota maqbarasini beton yordamida mustahkamlamoqchi bo‘lishgariligini isbotlaydi, maqbara tepasidagi ark quril bitqizilgan. U pishgan g‘ishtdan, standart shaklda bajarilgan bo‘lib, maqbaraning ichki qismi yog‘och tirkagichga mustahkamlangan.\n" +
                            "\n" +
                            "Langar ota qishlog‘ining o‘zida Oq masjid yoki Katta masjid nomi bilan mashhur bino mavjud. Bu — hech qachon ta’mirlanmagan, ilk ko‘rinishi saqlanib qolgan masjiddir. Tashqi ko‘rinishiga ahamiyat berilsa, qurilish tipi yonidagi uychalardan qolishmaydi.\n" +
                            "\n" +
                            "Langar ota maqbarasi oldidagi xijriy 122, melodiy 840 yili qurilgan Oq masjid keyinroq daryo qirg‘og‘iga olib o‘tilgan. Masjid ustuniga “masjid 122 yili qurilgan” deb yozilgan. Rangli naqshlarda shiftiga “Abadiy hayot” ramzi — Amir Temurning g‘alaba belgichi tushirilgan.\n" +
                            "\n" +
                            "500 yil avval san’atda hech qanday andaza bo‘lmaganligiga qaramay, ulug‘vor ustunlarning har biriga noyob suratlar tushirilgan.\n" +
                            "\n" +
                            "Ikkala Langarda ham vaqt shoshmay o‘tadi, u zamonlarda mehnatsevar odamlar oddiy hayot shukuhini surganligini, ularning ota-bobolari yuz, ikki yuz yil avval yashaganligini his qilish mumkin. Odamlar juda uzoq yashagan: yuz yil — dunyoni tark etish uchun o‘rtacha hayot. Bebaho ziyoratgohlari bor mahallik aholi bu yerlarni qadrlaydilar va shu yerda yashayotganliklaridan baxtiyordirlar.\n" +
                            "\n" +
                            "Bili qo‘ygan yaxshi:\n" +
                            "\n" +
                            "Abul Xasan Ishqiy masjidi 840 yili archadan qilingan ustanlardan qurilgan bo‘lib, noyob naqshlari shu kunga qadar saqlanib qolgan. Soyuz ittifoqi davrida bu masjidni buzib tashlamoqchi bo‘lishgan, biroq oqsoqollar pul yig‘ib, binoni davlatdan sotib olishgan.\n" +
                            "\n" +
                            "Keyinroq, ya’ni 50-yillarda madrasaning dars beriluvchi qismi buzib tashlangan. Katta qabr oldida, bir xil balandlikda ikkita ayvon joylashgan bo‘lib, ichida ikkita qorong‘u xonalari — shayh xonalari mavjud. Shundan qishloq nomi — Langar ota  kelib chiqqan. Ayvonlarning biri Mirzo Ulug‘bek davrida boshlangan, qurilish Ashtarxoniylar davriga kelib bitqizilgan.\n" +
                            "\n" +
                            "Sharqiy maqbara 11 X 9,5 m va 25 X 25 sm o‘lchamda gumbaz shaklida tekis g‘ishtlardan ko‘tarilgan. Mazkur ayvon 4 ta qabrdan iborat bo‘lib, ulardan eng kattasiga shayh Abul Xasan Ishqiyning nevarasi Mirimshayh dafn qilingan, degan taxminlar mavjud.\n" +
                            "\n" +
                            "Quyosh botadigan qismida15 X 12,5 m o‘lchamli ikkinchi ayvon bor. Ushbu ayvonda 8 ta maqbara bor, lekin ularning hech biridagi yozuv saqlanib qolmagan. Shunga qaramay, qabr ustidagi toshlardagi yozuvlarni o‘qirkansiz, Abul Xasan Ishqiyning avlodlarining ismlari tushirilganligini ko‘rasiz: shayh Muhammad Boqiy Ishqiy, Salimxo‘ja Niyozmuhammad xo‘ja o‘g‘li. Qishloqdagi chollarda “Abul Xasan Ishqiyning sulolasi” nomli kitob bo‘lib, u 3 qismdan iborat. Kitoblardan biri juda yaxshi holatda saqlanib qolgan. Abul Xasan Ishqiyning sulolasi islom dinining qimmatli o‘choqlaridan hisoblanadi.\n" +
                            "\n" +
                            "Langarlik chollarning gap-so‘ziga ko‘ra qachonlardir Langar ota haqida“Manoqib” nomli shayh tarixiy maqola yozilgan. Langar so‘zi bir necha ma’nolarga ega:\n" +
                            "\n" +
                            "1. Langarcho‘p — muvozanatni saqlashda yordam beruvchi qo‘ldagi tayoq.\n" +
                            "\n" +
                            "2. Islom dinida so‘fi va darveshlar langar tashlash orqali joylashadigan yerlarini aniqlashgan — bu yer o‘tov joyi bo‘lgan; shuningdek, beva va bechoralar joyi ham bo‘lib, boshpana va ovqat ajratilgan.\n" +
                            "\n" +
                            "3. Ba’zi manbaalarda mo‘g‘ulcha nomlarni ham uchratish mumkin: Langar — muqaddas mozor.",
                    38.68155385707002, 66.75766709724645
                )
            )
        }
        return list
    }
    override fun onItemClick(place: Place) {
        val bundle = Bundle()
        bundle.putSerializable("place", place)
        findNavController().navigate(R.id.descriptionFragment,bundle)

    }
}

