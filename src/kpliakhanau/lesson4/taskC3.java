package kpliakhanau.lesson4;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class taskC3 {

    public static void main(String[] args) {
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(nf.format(i)+" умноженое на "+nf.format(j)+" равно "+nf.format(i*j));
            }
            System.out.println();
        }
    }
}

