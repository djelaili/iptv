// by Djelaili cheikh
if (Arrays.asList(
    "قالون عن نافع",
    "ورش عن نافع",
    "البزي عن ابن كثير",
    "قنبل عن ابن كثير",
    "الدوري عن أبي عمرو",
    "السوسي عن أبي عمرو",
    "هشام عن ابن عامر",
    "ابن ذكوان عن ابن عامر",
    "شعبة عن عاصم",
    "حفص عن عاصم",
    "خلف عن حمزة",
    "خلاد عن حمزة",
    "أبو الحارث عن الكسائي",
    "الدوري عن الكسائي",
    "ابن وردان عن أبي جعفر",
    "ابن جماز عن أبي جعفر",
    "رويس عن يعقوب",
    "روح عن يعقوب",
    "إسحاق عن خلف العاشر",
    "إدريس عن خلف العاشر"
).contains(Mynovel)) {

    binding.textview2.setBackground(new GradientDrawable() {
        public GradientDrawable getIns(int a, int b) {
            this.setCornerRadius(a);
            this.setColor(b);
            return this;
        }
    }.getIns((int)15, 0xFF2196F3));

    binding.textview2.setText(
        _data.get((int)_position).get("novel").toString()
    );

    binding.textview2.setVisibility(View.VISIBLE);
}
