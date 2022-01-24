package com.psp.instrumentedtest_example;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class Test2 {

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule = new
            ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void test2() {
        onView(withId(R.id.btnHello)).perform(click());
        onView(withId(R.id.txtHello)).check(matches(withText("hello")));
    }
}
