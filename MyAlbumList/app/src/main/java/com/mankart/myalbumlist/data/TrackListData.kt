package com.mankart.myalbumlist.data

import com.mankart.myalbumlist.model.TrackList

object TrackListData {

    private val albumID = arrayOf(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    )

    private val songTitle = arrayOf(
        arrayOf(
            "Critical Aclaim",
            "Almost Easy",
            "Scream",
            "Afterlife",
            "Gunslinger",
            "Unbound (The Wild Ride)",
            "Brompton Cocktail",
            "Lost",
            "A Little Peace of Heaven",
            "Dear God",
            "Almost Easy (Jam-Along Version)"
        ),
        arrayOf(
            "Nightmare",
            "Welcome to the Family",
            "Danger Line","Buried Alive",
            "Natural Born Killer",
            "So Far Away",
            "God hate Us",
            "Victim",
            "Tonight the World Dies",
            "Fiction",
            "Save Me"
        ),
        arrayOf(
            "Trash Talkin'",
            "925",
            "Here We Go Again/Fanboi",
            "Plaza Avenue",
            "Happy"
        ),
        arrayOf(
            "Intro",
            "Kanyaah",
            "Paman Tua",
            "Kereta Ini Melaju Terlalu Cepat",
            "Beranjak Dewasa",
            "Bertaut",
            "Taruh",
            "Cermin",
            "Mendarah",
            "Sorak Sorai"
        ),
        arrayOf(
            "Berdua Saja",
            "Menuju Senja",
            "Untuk Perempuan yang Sedang Dipelukan",
            "Rahasia",
            "Angin Pujaan Hujan",
            "Di Ujung Malam",
            "Resah",
            "Biarkan"
        ),
        arrayOf(
            "American Idiot",
            "Jesus of Suburbia",
            "Holiday",
            "Boulevard of Broken Dreams",
            "Are We the Waiting",
            "St. Jimmy",
            "Give Me Novacaine",
            "She's a Rebel",
            "Extraordinary Girl",
            "Letterbomb",
            "Wake Me Up When September End",
            "Homecoming",
            "Whatsername"
        ),
        arrayOf(
            "Death On Two Legs (Dedicated To..)",
            "Lazing On a Sunday Afternoon",
            "I;m In Loving Best Friend",
            "You're My Best Friend",
            "'39",
            "Sweet lady",
            "Seaside Rendezvous",
            "The Prophet's Song",
            "Love of My Life",
            "Good Company",
            "Bohemian Rhapsody",
            "God Save the Queen"
        ),
        arrayOf(
            "Merah",
            "Biru",
            "Jingga",
            "Hijau",
            "Putih",
            "Kuning"
        ),
        arrayOf(
            "laguland",
            "Kalapuna",
            "Meramu",
            "Ikatan Waktu Lampau",
            "Aaa",
            "Dari Sebuah Mimpi Buruk",
            "Usang",
            "Ini dan Itu",
            "Lintasan Waktu"
        ),
        arrayOf(
            "Lantai Dansa",
            "Waktu Enggan Menyapa",
            "Paling Bisa",
            "Bersulang",
            "Masih Kurang",
            "Minta Lagi",
            "Tante Merry",
            "Ah Ahh Ahhh",
            "BOMAT!"
        ),
        arrayOf(
            "Like It here",
            "The House",
            "Catch Me",
            "Worth It",
            "Rabbit Run",
            "Cry Little Heart",
            "I'll Go Along",
            "You Were yhe Universe",
            "Summerfall",
            "Man Upon the Hill",
            "Old Man Finger"
        ),
        arrayOf(
            "AHeadFull of Dream",
            "Birds",
            "Hymn for the Weekend",
            "Adventure of a Lifetme",
            "Fun (feat. Tove lo)",
            "Kaleidoscope",
            "Army of One",
            "Amazing Day",
            "Colour Spectrum",
            "Up&Up"
        ),
        arrayOf(
            "Maps",
            "Animals",
            "It Was Always You",
            "Unkiss Me",
            "Sugar",
            "Leaving California",
            "In Your Pockets",
            "New Love",
            "Coming Back for You",
            "Feelings",
            "My Heart is Open (feat. Gwen Stacy)",
            "This Summer's Gonna Hurt Like MotherF****r",
            "Short Love",
            "Sex and Candy",
            "Lost Stars"
        ),
        arrayOf(
            "Kill This Love",
            "Don't Know What To Do",
            "Kick It",
            "Hope Not",
            "DDU-DU DDU-DU (Remix)"
        ),
        arrayOf(
            "Primavera",
            "Janj Wibawa (Remastered)",
            "Through the Shades of Paradise",
            "He's Got Me Singing Again",
            "Bunga",
            "Down in Vieux Cannes (Remastered)",
            "For the Time Being",
            "Matahari"
        )
    )

    private val songLength = arrayOf(
        arrayOf(
            "5.15","3.54","4.48","5.52","4.11","5.11",
            "4.12","5.01","8.00","6.33","3.55"
        ),
        arrayOf(
            "6.14","4.05","5.28","6.44","5.15",
            "5.26","5.29","7.29","4.41","5.07",
            "10.56"
        ),
        arrayOf(
            "2.44","3.10","3.12","4.11","2.57"
        ),
        arrayOf(
            "1.39","4.19","3.19","4.52","4.57",
            "5.15","4.09","4.37","4.02","5.40"
        ),
        arrayOf(
            "4.27","5.06","5.42","6.56","3.32",
            "4.50","4.00","5.42"
        ),
        arrayOf(
            "2.53","9.08","3.52","4.20","2.43","2.55",
            "3.26","2.00","3.33","4.06","4.45","9.19","4.12"
        ),
        arrayOf(
            "3.43","1.07","3.05","2,52","3.30","4.03",
            "2.19","8.20","3.39","3.23","5.54","1.15"
        ),
        arrayOf(
            "11.20","9.52","13.28","7.46","9.46","12.16"
        ),
        arrayOf(
            "5.17","4.12","4.26","4.08","4.35","6.08",
            "4.07","3.42","5.19","4.40"
        ),
        arrayOf(
            "2.56","2.40","4.28","2.42","3.54","3.11",
            "3.33","3.26","3.20"
        ),
        arrayOf(
            "4.21","3.49","3.36","3.34","2.57","4.07",
            "2.52","3.28","4.46","3.37","2.24"
        ),
        arrayOf(
            "3.43","3.49","4.18","4.42","4.23","4.27",
            "1.51","6.16","4.31","1.00","6.46"
        ),
        arrayOf(
            "3.10","3.51","4.00","3.58","3.55","3.23","3.39",
            "3.16","3.47","3.14","3.57","3.44","3.10","4.25","4.27"
        ),
        arrayOf(
            "3.09","3.21","3.11","3.11","3.21"
        ),
        arrayOf(
            "4.52","4.06","4.48","4.29","4.13","3.12","3.48","5.23"
        )
    )


    val listTrack: ArrayList<TrackList>
        get() {
            val list = arrayListOf<TrackList>()
            for (position in albumID.indices) {
                val trackList = TrackList()

                trackList.albumID = albumID[position]
                trackList.songTitle = songTitle[position]
                trackList.songLength = songLength[position]

                list.add(trackList)
            }
            return list
        }

}