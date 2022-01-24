package com.psp.instrumentedtest_example;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new
            ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void testHello() {
        onView(withId(R.id.btnHello)).perform(click());
        onView(withId(R.id.txtHello)).check(matches(withText("hello")));
    }

    @Test
    public void testWorld() {
        onView(withId(R.id.btnWorld)).perform(click());
        onView(withId(R.id.txtWorld)).check(matches(withText("world")));
    }

}