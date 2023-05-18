package com.example.latrobe;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Subjects2 extends AppCompatActivity {
    // this part is built to improve calendar view
    TextView t1,t2;
    Bundle er;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects2);

        t1= findViewById(R.id.textView6);
        t2= findViewById(R.id.textView11);

        er=getIntent().getExtras();
        a=er.getString("su");


        //Displaying data based upon the button clicked
        if(a.equals("1")){
            t1.setText("Mobile Application And Development");
            t2.setText("From mobile application development, you will learn programming languages like Java, Kotlin, Swift, or Objective-C. You'll gain knowledge of mobile app architectures, user interface design, and frameworks like React Native or Flutter for cross-platform development. Understanding mobile app security, performance optimization, backend integration, testing, and debugging will be crucial. You'll also learn about app store guidelines and the submission process. Mobile app development is a continuous learning journey, requiring you to stay updated with the latest technologies and trends. Overall, it equips you with the skills to design, build, and deploy mobile apps, contributing to the thriving mobile app industry.");
        }

        if(a.equals("2")){
            t1.setText("System Analysis And Design");
            t2.setText("In a system analysis and design subject, you will learn various key aspects of developing effective and efficient information systems. You will gain knowledge of requirements gathering and analysis techniques to understand user needs. You'll learn to design system architectures, including data models and process flows. Understanding system design principles, such as modularization and scalability, will be crucial. You'll also learn about system implementation strategies, project management methodologies, and quality assurance techniques. Additionally, you will gain an understanding of system maintenance and support. This subject equips you with skills to analyze, design, and develop robust and user-friendly information systems that meet organizational needs.");
        }

        if(a.equals("3")){
            t1.setText("Algorithm And Data Structure");
            t2.setText("In an algorithm and data structure subject, you will learn fundamental concepts and techniques for organizing and manipulating data efficiently. You will gain knowledge of various data structures like arrays, linked lists, stacks, queues, trees, graphs, and hash tables. Understanding their properties, operations, and time complexity will be crucial for designing efficient algorithms. You will learn different sorting and searching algorithms and analyze their performance. Additionally, you will explore algorithm design paradigms like divide and conquer, greedy algorithms, and dynamic programming. This subject equips you with problem-solving skills, algorithm analysis techniques, and the ability to choose and implement appropriate data structures for efficient data management and manipulation.");
        }

        if(a.equals("4")){
            t1.setText("Professional Practices And Entreepreneurship");
            t2.setText("In the subject of Professional Practices and Entrepreneurship, you will learn essential skills and knowledge to thrive in the professional world and explore entrepreneurship. You will gain an understanding of professional ethics, workplace etiquette, and effective communication skills. You'll learn about project management methodologies, teamwork, and collaboration, enhancing your ability to work effectively in a professional setting. Additionally, you will gain insights into entrepreneurship, including business planning, market research, financial management, and marketing strategies. This subject equips you with the practical skills and mindset required to succeed in the professional arena and provides a foundation for exploring entrepreneurial opportunities and creating your own ventures.");
        }
    }
}

