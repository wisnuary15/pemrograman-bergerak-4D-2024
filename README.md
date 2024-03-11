# Pemrograman Bergerak 4D 2024
Repository dari praktikum mata kuliah Pemrograman Bergerak kelas 4D.
Kumpulkan tugas yang sudah dibuat di folder yang sudah disediakan dan kumpulkan tugas ketika sudah melakukan asistensi kepada Asisten Praktikum.

Tata cara mengumpulkan tugas (buat yang males baca, ini versi video: )
1. Instal Git Bash di laptop milik teman-teman (kalau belum instal, tutorial instalasi ada di sini  https://www.youtube.com/watch?v=uIjoN19McGU)
2. Kalau sudah instal Git Bash, Fork Repository ini dengan cara klik tombol fork di pojok kanan atas
3. Lalu biarkan settingan yang sudah terisi, langsung saja klik "Create Fork"
4. Setelah Fork, klik Code dan klik tombol copy yang berada di samping link HTTPS
5. Lalu buka File Manager, masuk ke folder di mana kalian ingin menyimpan repository Git (misalnya C:\Git)
6. Setelah itu klik kanan di file manager, lalu pilih git bash here
7. Git bash akan terbuka, setelah itu ketik "git clone linkyangdicopy", contoh: git clone https://github.com/kevinmf1/pemrograman-bergerak-4D-2024.git
8. Kalau sudah muncul pesan "Receiving objects: 100%, done" berarti git clone sudah berhasil
9. Lalu buka folder tersebut menggunakan VSCode dengan cara klik file di pojok kanan atas, lalu open folder dan arahkan ke folder yang menjadi tempat dari git clone
10. Kalau sudah dibuka, langkah selanjutnya adalah membuat folder di dalam modul (sesuai dengan modul yang ingin dikirimkan) dengan format NIM-NamaKamu dan untuk nama tidak menggunakan spasi, namun diganti dengan huruf kapital di setiap nama (contoh: 200441100014-KevinMalikFajar)
11. Setelah itu buka Android Studio, klik File -> Export -> Export to ZIP file... dan pilih folder di mana kamu menaruh folder NIM-Nama hasil git clone
12. Jika sudah buka File Manager, arahkan ke folder NIM-Nama, dan extract file ZIP yang berasal dari Android Studio (extract di folder tersebut/extract here)
13. setelah itu buka lagi VSCode, klik source control (atau CTRL+Shift+G) dan masukkan pesan commit (contoh: Mengumpulkan Tugas Praktikum Modul 1, asprak kak Kukuh)
14. Lalu klik commit, nanti akan muncul pop up "there are no staged changes to commit" dan langsung aja klik YES dan setelah itu klik Sync Changes
15. Lalu akan muncul pop up lagi This action will pull and push commits from and to "origin/main", langsung aja klik OK
16. Commit sudah selesai dan sekarang balik lagi ke GitHub, lalu masuk ke repository praktikum yang tadi kalian Fork
17. Kalau ada tulisan "This branch  is 1 commit ahead of NAMAREPONYA", berarti commit yang kalian buat sudah berhasil, setelah itu klik tombol Contribute di bawah tulisan tersebut
18. Lalu klik tombol Open Pull Request, akan diarahkan ke halaman baru dan biarkan settingan yang sudah ada, langsung saja klik Create Pull Request, tunggu sebentar dan scroll ke bawah lagi lalu klik Create Pull Request lagi (jadi ada 2 tombol Create Pull Request yang diklik)
19. Jika sudah ada bacaan "Open" di halaman baru, berarti pull request sudah berhasil dilakukan dan tinggal konfirmasi ke asisten praktikum kalau sudah melakukan pull request, nantinya asisten praktikum akan mengecek pull request dan menerima hasil pull request