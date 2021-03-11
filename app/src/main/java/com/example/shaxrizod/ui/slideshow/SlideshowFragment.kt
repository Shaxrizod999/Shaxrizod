package com.example.shaxrizod.ui.slideshow

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
import com.example.shaxrizod.databinding.FragmentSlideshowBinding
import com.example.shaxrizod.models.Place

class SlideshowFragment : Fragment(),  RecyclerAdapter.OnClick {

    private lateinit var binding: FragmentSlideshowBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        binding.rv.adapter = RecyclerAdapter(initList(),this)
        return binding.root
    }
    private fun initList(): List<Place>{

        val list = ArrayList<Place>()

        for (i in 1..33) {
            list.add(
                Place(
                    "Qashqadaryo viloyati",
                    "Qashqadaryo",
                    R.drawable.qashqadaryo,
                    "mavjud emas",
                    "+998 71 123 45 67",
                    "Viloyat haqida\n" +
                            "Viloyat Qashqadaryo daryosining havzasida Pomir-Oloy tog‘ining g‘arbiy qiyaligida joylashgan.Qashqadaryo mintaqasi ob-havosi ekologik jihatdan eng toza  bo‘lgan Qashqadaryo vohasida joylashgan eng sara manzillardan biridir.Qashqadaryo nomi bir necha maʼnolarni anglatadi, jumladan “qumda yo‘qolayotgan daryo” va “shaffof va toza daryo” dir.\n" +
                            "\n",
                    38.86662135111598,
                    65.8002461832504
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
        }
        return list
    }
    override fun onItemClick(place: Place) {
        val bundle = Bundle()
        bundle.putSerializable("place", place)
        findNavController().navigate(R.id.descriptionFragment,bundle)

    }
}

