# Втора лабораториска вежба по Софтверско инженерство
<h2>Jане Панов, бр. на индекс 213201</h2>
<br>
<h3><b>
  Control Flow Graph
</b></h3>
<hr>
<img src="https://ucd5d249efae7b8751be59db5213.previews.dropboxusercontent.com/p/thumb/AB4MAoJrSz0kLBBXWZGY4g_zjpBqi0mYbsoBkWfYLCMB5FhKgm467uHO9bDDkZDtnCRF0_1wye9Acuf-Xg-tnI62cRO2V-kc3MH2YzrbOsHeKCJXqMtLs0mfBOyqbYpA4zbH6-jck4uBUHJ2sxuH4m7eWkRZZ4AQDtZhw6plvE_FPaZE9VrW8isGtt_oG3HP9yZC2qeE9Q6iQKm_bfxEAu_41BCc6svicLhCqyz_546-7SdqBVXfMNcmBPVq5zASY6-lGD-y_SMwKswzitCzDCzG4hrBxxd5O2Y9bxBxDpCzBAOOoZlIxpVdiod82hKKiBNKN9MgQC9QnKIRSSrIHMzk43cRnaI7GIL1GG2wd4z8ZCRML2Pmyt-xW0V77J6mF8wZOOh1IS6toVr50JS_ZZBaFq4dFcDM1HjDTledS9TI-A/p.png" alt="Control Flow Graph - Lab 2 SI, 213201">
<br><br>

<h3><b>
  Цикломатска комплексност
</b></h3>
<hr>

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајов P=10, па цикломатската комплексност изнесува 11.
<br><br><br><br>
<h3><b>
  Тест случаи според критериумот Every Branch
</b></h3>
<hr>

<i>1</i>.User.username = null, User.password = "test", User.email = "si@lab2.com"<br>
(Нема корисник со исти податоци во листата на корисници)

<i>2</i>.User.username = bubokarov, User.password = "trotinet 69", User.email = "bubokarov@gmail.com"<br>
(Постои корисник со исти податоци во листата на корисници)

<i>3</i>.User.username = milepanika, User.password = "tocak123", User.email = "milepanika@yahoo.com"<br>
(Нема корисник со исти податоци во листата на корисници)

<i>4</i>.User.username = toshomalerot, User.password = "r#wed9xwZ", User.email = "toshomalerotgmailcom"<br>
(Нема корисник со исти податоци во листата на корисници)

<i>5</i>.User.password == null<br>
(Фрлен исклучок)

<h5><em>
Потребни се 5 теста за да добиеме 100% покриеност. Со овие 5 теста сме сигурни дека секоја гранка во кодот се извршува барем
еднаш.
</em></h5>
<br><br>
<h3><b>
  Тест случаи според критериумот Multiple Condition
</b></h3>
<hr>

Услов: <i>if (user==null || user.getPassword()==null || user.getEmail()==null)</i>

Решение: Доволно е да се најде еден точен услов на било која позиција од можните 3 услови, бидејќи трите услови се меѓусебно поврзани со ИЛИ ( || )

<h5><i>1.</i> T || X || X</h5>
Доколку (user==null) == ТRUE, целиот израз е точен.

<h5><i>2.</i> F || T || X</h5>
И покрај тоа што првиот услов (user==null) == FALSE, вториот услов е точен (user.getPassword()==null) == TRUE, односно целиот израз е точен.

<h5><i>3.</i> F || F || T</h5>
И покрај тоа што првите два услови не се исполнети, третиот услов (user.getEmail()==null) == TRUE, односно целиот израз е точен.

<h5><i>4.</i> F || F || F</h5>
Во овој случај ни еден од трите услови не е исполнет, односно целиот израз е неточен.
<br><br><br><br>
<h3><b>
  Објаснување на напишаните unit tests
</b></h3>
<hr>

Самите unit tests ги напишав и тестирав користејќи го Gradle. Во SILab2Test.java дефинирав две методи, testEveryBranch и testMultipleCondition. 

Во testEveryBranch методот се напишани минималниот број на тестови(комбинации) со кој се одредува однесувањето на самата програма според Every Branch критериумот.

Во testMultipleCondition се напишани минималниот број на комбинации со кој се одредува однесувањето на самиот услов <i>if (user==null || user.getPassword()==null || user.getEmail()==null)</i> според Multiple Condition критериумот. 

За тоа кои комбинации се искористени се со цел да се покријат сите можни влезови се напишани погоре

<i>*Во самите тестови се внесувани повеќе корисници со се цел да се сумилира како би се однесувала програмата доколку се случи одреден корисник да има исто име, лозинка или е-адреса со друг корисник.</i>
