<h1>lab 02 po sofversko inzenerstvo</h1>
<h2>Matej Arsovski</h2>
<h3>Control Flow Graph</h3>

![ezgif-2-21d196c74a](https://github.com/MatejArsovski/SI_2024_lab2_213037/assets/166020811/d31bb923-38f8-4490-8796-7fab81df3b90)



<h3>Цикломатска комплексност</h3>
<p>Врз основа на графичкиот приказ, цикломатската комплексност изнесува 8</p>

<h3>Тест случаи според критериумот Every Branch, користам само 4 случаи.</h3>
<p>- Тест случај кој го правиме  сите напишаните allItems е null.<br></p>
<p>- Тест случај кој го правиме  кога getBarcode != null или има должина 0.</p>
<p>- Тест случај кога ja имаме ситуацијата со само barcode да е not null.</p>
<p>- Тест случај кога sum е < од износот на payment.</p>

<h3>Тестови за Multiple Condition</h3>

<p>- item.getName() е null или item.getName(). има должина 0</p>
<p>- item.getPrice() е поголема од 300 и item.getDiscount() е поголем од 0 и item.getBarcode(). започнува со '0'</p>

<h3>Unit тестови</h3>

<p>- testAllItemsNull ги тертираме кога allItems е null<br></p>
<p>- getBarcode не е null и има должина 0</p>
<p>-Самиот barcode е '0'</p>

<h3>Тестови за Every Branch:</h3>

<p>- name ни е null или има должина еднакква на  0<br></p>
<p>- price е > од 300 и го има самиот discount</p>
