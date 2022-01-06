package com.iftech.ifcafe;


import android.content.Context;

import java.util.ArrayList;

class FoodData {
    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.black_salad);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.cheesecake);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.mie_goreng);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.sparkling_tea);

        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("cheese cake", "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula", 31000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Donat", "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.", 12500, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Black Salad", "Salad Charcoal", 17000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Batagor", "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia.", 13000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cireng", "Cireng adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an.", 15000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Mie Goreng", "Mi goreng berarti \"mi yang digoreng\" adalah hidangan mie yang dimasak dengan digoreng tumis khas Indonesia. Mi goreng juga populer dan juga digemari di Malaysia, dan Singapura.", 12000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.", 15000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Cappucino", "Kapucino adalah minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania.", 18000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Kopi Hitam", "Kopi hitam, merupakan hasil ektraksi langsung dari perebusan biji kopi yang disajikan tanpa penambahan perisa apapun. Espreso, merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.", 15000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Sparkling Tea", "Minuman ini dijamin bikin segaar. Perpaduan rasa asamnya strawberry yang segar dicampur dengan teh dan soda. Terbayang bukan sensainya segarnya?", 11000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }

}
