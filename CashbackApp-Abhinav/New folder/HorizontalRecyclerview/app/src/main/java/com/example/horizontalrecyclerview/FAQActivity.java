package com.example.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.horizontalrecyclerview.R;

import java.util.ArrayList;

public class FAQActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFAQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        recyclerViewFAQ = findViewById(R.id.recyclerViewFAQ);

        recyclerViewFAQ.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));

        // dummy data
        ArrayList<FAQItem> faqItemArrayList = new ArrayList<>();
        faqItemArrayList.add(new FAQItem("User registration", "lorem ipsum dolor sit amet\nlorem ipsum dolor sit"));
        faqItemArrayList.add(new FAQItem("Categories", "lorem ipsum dolor sti amet"));
        faqItemArrayList.add(new FAQItem("Books", "lorem ipsum dolor sti amet"));
        faqItemArrayList.add(new FAQItem("Shopping", "lorem ipsum dolor sti amet\nlorem lorem ipsum ipsum"));
        faqItemArrayList.add(new FAQItem("Diesel", "lorem ipsum dolor sit amet"));

        RecyclerViewFAQAdapter recyclerViewFAQAdapter = new RecyclerViewFAQAdapter(faqItemArrayList);
        recyclerViewFAQ.setAdapter(recyclerViewFAQAdapter);

    }
}
