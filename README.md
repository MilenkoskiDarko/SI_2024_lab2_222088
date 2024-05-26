Дарко Миленкоски 222088

Control Flow Graph

![SI_Lab2_CFG](https://github.com/MilenkoskiDarko/SI_2024_lab2_222088/assets/131350016/3d08cff4-5772-4afe-b0a9-38d426f30efe)

Цикломатска комплексност

Цикломатската комплексност на овој код е 10, ја добив со формулата P+1, во случајов бројот на предикатни јазли е 9, па цикломатската изнесува 10.


Објаснување на тест примерите

![si labs excel](https://github.com/MilenkoskiDarko/SI_2024_lab2_222088/assets/131350016/eaf55a75-0a1d-47c1-bcbd-8ace866a0b29)


Тест случаи според критериумот Multiple Condition
за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0') -TTT -> item.price = 340; item.discount = 0.4; item.barcode = "0432"

-TTF -> item.price = 365; item.discount = 0.3; item.barcode = "853124"

-TFX -> item.price = 365; item.discount = -0.3; item.barcode = any

-FXX -> item.price = 200; item.discount = any; item.barcode = any

Објаснување на напишаните Unit Tests

Unit тестовите за сите случаи ги пишував според Control Flow Graph за да ги опфатам сите гранки. Во Excel ги запишав сите гранки. Започнав со најосновниот тест случај кој веднаш ќе предизвика исклучок, па постепено ги проширував за да ги опфатам сите можни сценарија.
