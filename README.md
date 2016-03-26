# Custom Progress Bar
A simple, elegant and customizable progress bar for your android app.

## Preview

![Preview Image](../master/CustomProgressBar.png?raw=true)

## How to use it
Include the custom progress bar in your xml layout file.

```xml
<com.example.customprogressbar.CustomProgressBar
    android:id="@+id/progress_bar"
    android:layout_width="100dp"
    android:layout_height="100dp" />
```

### Regular 
![Preview Image](../master/snaps/1_regular.png?raw=true)
```java
progressBar.setStartAngle(270);
progressBar.setProgressRingBackgroundColor("#DFDFDF");
progressBar.setProgressRingForegroundColor("#2C98C1");
progressBar.setCenterBackgroundColor("#213051");
progressBar.setStyle(Style.REGULAR);// Default style
progressBar.setVisibility(View.VISIBLE);
```

### Regular Tweaked
![Preview Image](../master/snaps/2_regular_tweaked.png?raw=true)
```java
progressBar.setStartAngle(180);
progressBar.setRingRadiusRatio(0.75f);
progressBar.setTextColor(Color.WHITE);
progressBar.setStyle(Style.REGULAR);// Default style
progressBar.setProgressRingBackgroundColor(Color.TRANSPARENT);
progressBar.setProgressRingForegroundColor("#e300fc");
progressBar.setCenterBackgroundColor("#213051");
progressBar.setVisibility(View.VISIBLE);
```

### Hollow 
![Preview Image](../master/snaps/3_hollow.png?raw=true)
```java
progressBar.setStartAngle(90);
progressBar.setRingRadiusRatio(0.65f);
progressBar.setTextSize(20);
progressBar.setTextColor(Color.BLACK);
progressBar.setStyle(Style.HOLLOW);
progressBar.setVisibility(View.VISIBLE);
```

### Regular Pie 
![Preview Image](../master/snaps/4_regular_pie.png?raw=true)
```java
progressBar.setStartAngle(0);
progressBar.setTextSize(32);//
// progressBar.setDisplayProgressPercentage(false); // can be used
progressBar.setProgressRingBackgroundColor(Color.LTGRAY);
progressBar.setProgressRingForegroundColor(Color.BLACK);
// centerBackgroundColor doesnt effect this style
progressBar.setStyle(Style.PIE);
progressBar.setVisibility(View.VISIBLE);
```
### Outer Pie 
![Preview Image](../master/snaps/5_pie_outer.png?raw=true)
```java
progressBar.setStartAngle(0);// Default
progressBar.setRingRadiusRatio(0.80f);
progressBar.setTextSize(18);
progressBar.setCenterBackgroundColor("#fcd200");
progressBar.setProgressRingForegroundColor("#fc8200");
// progressBar.setProgressRingBackgroundColor("#213051"); // wont affect this style
progressBar.setTextColor(Color.BLUE);
progressBar.setStyle(Style.PIE_OUTER);
progressBar.setVisibility(View.VISIBLE);
```

### Inner Pie 
![Preview Image](../master/snaps/6_pie_inner.png?raw=true)
```java
progressBar.setStartAngle(180);
progressBar.setRingRadiusRatio(0.90f);
progressBar.setTextSize(26);
progressBar.setTextColor(Color.WHITE);
progressBar.setCenterBackgroundColor("#001dfc");
progressBar.setProgressRingForegroundColor("#a3cbf7");
// progressBar.setProgressRingBackgroundColor(Color.TRANSPARENT); // doesnt affect this style
progressBar.setStyle(Style.PIE_INNER);
progressBar.setVisibility(View.VISIBLE);
```

More cool types of progressbars can be rendered using the same custom class, so donot limit your imagination and creativity.


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/amrendra18/customprogressbar/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

