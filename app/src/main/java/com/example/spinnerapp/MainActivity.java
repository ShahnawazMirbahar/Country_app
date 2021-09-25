package com.example.spinnerapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countryNames;
    private Spinner spinner;
    private Button button;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryNames = getResources().getStringArray(R.array.country_names);

        spinner = (Spinner)  findViewById(R.id.spinnerId);
        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.buttonId);
        imageView = (ImageView) findViewById(R.id.imageView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewSampleId,countryNames);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String values = spinner.getSelectedItem().toString();
                if(values.contains("Bangladesh"))
                {
                    textView.setText("Bangladesh is a country in South Asia. It is the eighth-most populous country in the world, with a population exceeding 163 million people, in an area of 148,560 square kilometres (57,360 sq mi),[8] making it one of the most densely populated countries in the world. Bangladesh shares land borders with India to the west, north, and east, Myanmar to the southeast, and the Bay of Bengal to the south. It is narrowly separated from Nepal and Bhutan by the Siliguri Corridor, and from China by the Indian state of Sikkim in the north, respectively. Dhaka, the capital and largest city, is the nation's economic, political, and cultural hub. Chittagong, the largest seaport, is the second-largest city.");
                    imageView.setImageResource(R.drawable.bangladesh);
                }
                else if (values.contains("India"))
                {
                    textView.setText("India is a large multicultural country in South Asia, with a population of over one billion. The Indian economy is the fourth largest in the world in terms of purchasing power parity and is the world's second-fastest growing economy. India is also the second most populous country in the world, and the world's largest democracy. India has grown significantly, in terms of both population and strategic importance, in the last 20 years. It has also emerged as an important regional power, with one of the world's largest militaries and a declared nuclear weapons capability");
                    imageView.setImageResource(R.drawable.india);
                }
                else if(values.contains("Pakistan"))
                {
                    textView.setText("Pakistan is a country in South Asia. It is the world's fifth-most populous country, with a population exceeding 225.2 million, and has the world's second-largest Muslim population. Pakistan is the 33rd-largest country by area, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman.");
                    imageView.setImageResource(R.drawable.pakistan);
                }
                else if(values.contains("Nepal"))
                {
                    textView.setText("Nepal is mainly situated in the Himalayas, but also includes parts of the Indo-Gangetic Plain, bordering Tibet of China to the north, and India in the south, east, and west, while it is narrowly separated from Bangladesh by the Siliguri Corridor, and from Bhutan by the Indian state of Sikkim. Nepal has a diverse geography, including fertile plains, subalpine forested hills, and eight of the world's ten tallest mountains, including Mount Everest, the highest point on Earth. Nepal is a multi-ethnic, multi-lingual, multi-religious and multi-cultural state, with Nepali as the official language. Kathmandu is the nation's capital and the largest city.");
                    imageView.setImageResource(R.drawable.nepal);
                }
                else if(values.contains("Bhutan"))
                {
                    textView.setText("Bhutan is a landlocked country in the Eastern Himalayas. It is bordered by China to the north and India to the south, east and west. Nepal and Bangladesh are located in proximity to Bhutan but do not share a land border. The country has a population of over 754,000[12] and a territory of 38,394 square kilometers (14,824 sq mi) which ranks 133rd in terms of land area, and 160th in population. Bhutan is a constitutional monarchy with Vajrayana Buddhism as the state religion.");
                    imageView.setImageResource(R.drawable.bhutan);
                }
                else if(values.contains("Sri Lanka"))
                {
                    textView.setText("Sri Lanka is an island country in South Asia. It lies in the Indian Ocean, southwest of the Bay of Bengal, and southeast of the Arabian Sea; it is separated from the Indian subcontinent by the Gulf of Mannar and the Palk Strait. Sri Lanka shares a maritime border with India and the Maldives. Sri Jayawardenepura Kotte is its legislative capital, and Colombo is its largest city and financial centre.");
                    imageView.setImageResource(R.drawable.srilanka);
                }
                else if (values.contains("Afghanistan"))
                {
                    textView.setText("Afghanistan is a landlocked country at the crossroads of Central and South Asia. It is bordered by Pakistan to the east and south, Iran to the west, Turkmenistan and Uzbekistan to the north, and Tajikistan and China to the northeast. Occupying 652,864 square kilometers (252,072 sq mi), the country is predominately mountainous with plains in the north and southwest. It is inhabited by 31.4 million people as of 2020, composed mostly of ethnic Pashtuns, Tajiks, Hazaras, and Uzbeks. Kabul serves as its capital and largest city.");
                    imageView.setImageResource(R.drawable.afghanistan);
                }
                else
                {

                    textView.setText("Maldives is an archipelagic state in the Indian subcontinent of Asia, situated in the Indian Ocean. It lies southwest of Sri Lanka and India, about 700 kilometres (430 mi) from the Asian continent's mainland. The chain of 26 atolls stretches from Ihavandhippolhu Atoll in the north to Addu Atoll in the south (across the Equator). Comprising a territory spanning roughly 90,000 square kilometres (35,000 sq mi) including the sea, land area of all the islands comprises 298 square kilometres (115 sq mi), Maldives is one of the world's most geographically dispersed sovereign states as well as the smallest Asian country by land area and, with around 557,426 inhabitants, the 2nd least populous country in Asia. Malé is the capital and the most populated city, traditionally called the \"King's Island\" where the ancient royal dynasties ruled for its central location");
                    imageView.setImageResource(R.drawable.maldives);
                }
            }
        });
    }
}