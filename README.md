# Andro Tools
It is an Android Studio tool developed to make it easier to program code that many programmers use in developing Android applications using the Java and Kotlin programming languages

### Currencies
Simple way to convert data string or double into available currency string:

**Rupiah Indonesia**
```
String rupiah = CurrencyTools.rupiah(1000000);
// or
String rupiah = CurrencyTools.rupiah("1000000");
```

### NULL Checker
Simple way to ensure data is null or not
```
boolean isNull = AppTools.isNotNull("string");
```

### Shows dialog
A simple way to display dialogs
- SnackBar
  ```
  DialogTools.snackBar(view, throwable);
  // or
  DialogTools.snackBar(view, "string");
  // or is indent
  DialogTools.snackBar(view, throwable, true);
  ```
- Toast
  ```
  DialogTools.toast(context, "string");
  // or
  DialogTools.toast(context, throwable);
  ```
- Alert
  ```
  DialogTools.alert(activity, "Title text", "Message text");
  // or
  DialogTools.alert(activity, "Title text", throwable);
  ```

### RecyclerView Style
Simple way to configure RecyclerView
- Vertical RecyclerView
  ```
  RecyclerTools.settingVertical(context, recyclerView);
  // or add divider
  RecyclerTools.settingVertical(context, recyclerView, true);
  // or make reverse
  RecyclerTools.settingVertical(context, recyclerView, true, true);
  ```

### Time Tools
Simple way to generate time format
- Make Countdown (HH:ii:ss)
  Create countdown time `timestamp` - `NOW`
  ```
  String countdown = TimeTools.getDuration(longTimestamp);
  ```
- Format date (dd MMMM YYYY)
  Make date format, example 19 April 2000
  ```
  String date = TimeTools.formatDateFull(longTimestamp);
  ```
- Convert date time format
  Make custom format from old format, example from 2000-04-19 07:00:00 to 19 April 2000
  ```
  String format = "dd MMMM YYYY"; // custom
  String newFormat = TimeTools.getTimeFull("2000-04-19 07:00:00", format);
  ```
- Convert string time to long timestamp in millis
  Example, "2000-04-19 07:00:00" to long
  ```
  long timeStamp = TimeTools.getTimeLong("2000-04-19 07:00:00");
  ```
- Get Day Name in Indonesian
  Day in Indonesian (Minggu, Senin, Selasa, Rabu, Kamis, Jumat, Sabtu)
  ```
  String day = TimeTools.getDayName(0); // return "Minggu"
  String day = TimeTools.getDayName(1); // return "Senin"
  String day = TimeTools.getDayName(2); // return "Selasa"
  String day = TimeTools.getDayName(3); // return "Rabu"
  String day = TimeTools.getDayName(4); // return "Kamis"
  String day = TimeTools.getDayName(5); // return "Jumat"
  String day = TimeTools.getDayName(6); // return "Sabtu"
  ```