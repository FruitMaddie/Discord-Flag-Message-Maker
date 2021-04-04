package flagMaker;

public class converter {
	public static convertedString convert (String input) {
		input = input.toLowerCase();
		String[] args = input.split(" ");
		String output = "";
		int numberOfEmotes = 0;
		for (String current : args) {
			for (int c = 0; c < current.length(); c++) {
				//System.out.println("At the start of the loop, c is " + c);
				char firstChar = current.charAt(c);
				//System.out.println("firstChar is " + firstChar);
				if (c + 1 >= current.length()) {
					//System.out.println("C is the last char, and is " + c);
					output += converter.charToEmote(firstChar);
					numberOfEmotes++;
				} else {
					String flag = current.substring(c, c + 2);
					//System.out.println("The flag being tested is " + flag);
					switch (flag) {
						case "af":
						case "ax":
						case "al":
						case "dz":
						case "as":
						case "ad":
						case "ao":
						case "ai":
						case "aq":
						case "ag":
						case "ar":
						case "am":
						case "aw":
						case "au":
						case "at":
						case "az":
						case "bs":
						case "bh":
						case "bd":
						case "bb":
						case "by":
						case "be":
						case "bz":
						case "bj":
						case "bm":
						case "bt":
						case "bo":
						case "ba":
						case "bw":
						case "br":
						case "io":
						case "vg":
						case "bn":
						case "bg":
						case "bf":
						case "bi":
						case "kh":
						case "cm":
						case "ca":
						case "ic":
						case "cv":
						case "bq":
						case "ky":
						case "cf":
						case "td":
						case "cl":
						case "cn":
						case "cx":
						case "cc":
						case "co":
						case "km":
						case "cg":
						case "cd":
						case "ck":
						case "cr":
						case "ci":
						case "hr":
						case "cu":
						case "cw":
						case "cy":
						case "cz":
						case "dk":
						case "dj":
						case "dm":
						case "do":
						case "ec":
						case "eg":
						case "sv":
						case "gq":
						case "er":
						case "ee":
						case "et":
						case "eu":
						case "fk":
						case "fo":
						case "fj":
						case "fi":
						case "fr":
						case "gf":
						case "pf":
						case "tf":
						case "ga":
						case "gm":
						case "ge":
						case "de":
						case "gh":
						case "gi":
						case "gr":
						case "gl":
						case "gd":
						case "gp":
						case "gu":
						case "gt":
						case "gg":
						case "gn":
						case "gw":
						case "gy":
						case "ht":
						case "hn":
						case "hk":
						case "hu":
						case "is":
						case "in":
						case "id":
						case "ir":
						case "iq":
						case "ie":
						case "im":
						case "il":
						case "it":
						case "jm":
						case "jp":
						case "je":
						case "jo":
						case "kz":
						case "ke":
						case "ki":
						case "xk":
						case "kw":
						case "kg":
						case "la":
						case "lv":
						case "lb":
						case "ls":
						case "lr":
						case "ly":
						case "li":
						case "lt":
						case "lu":
						case "mo":
						case "mk":
						case "mg":
						case "mw":
						case "my":
						case "mv":
						case "ml":
						case "mt":
						case "mh":
						case "mq":
						case "mr":
						case "mu":
						case "yt":
						case "mx":
						case "fm":
						case "md":
						case "mc":
						case "mn":
						case "me":
						case "ms":
						case "ma":
						case "mz":
						case "mm":
						case "na":
						case "nr":
						case "np":
						case "nl":
						case "nc":
						case "nz":
						case "ni":
						case "ne":
						case "ng":
						case "nu":
						case "nf":
						case "kp":
						case "mp":
						case "no":
						case "om":
						case "pk":
						case "pw":
						case "ps":
						case "pa":
						case "pg":
						case "py":
						case "pe":
						case "ph":
						case "pn":
						case "pl":
						case "pt":
						case "pr":
						case "qa":
						case "re":
						case "ro":
						case "ru":
						case "rw":
						case "ws":
						case "sm":
						case "st":
						case "sa":
						case "sn":
						case "rs":
						case "sc":
						case "sl":
						case "sg":
						case "sx":
						case "sk":
						case "si":
						case "gs":
						case "sb":
						case "so":
						case "za":
						case "kr":
						case "ss":
						case "es":
						case "lk":
						case "bl":
						case "sh":
						case "kn":
						case "lc":
						case "pm":
						case "vc":
						case "sd":
						case "sr":
						case "sz":
						case "se":
						case "ch":
						case "sy":
						case "tw":
						case "tj":
						case "tz":
						case "th":
						case "tl":
						case "tg":
						case "tk":
						case "to":
						case "tt":
						case "tn":
						case "tr":
						case "tm":
						case "tc":
						case "vi":
						case "tv":
						case "ug":
						case "ua":
						case "ae":
						case "gb":
						case "us":
						case "uy":
						case "uz":
						case "vu":
						case "va":
						case "ve":
						case "vn":
						case "wf":
						case "eh":
						case "ye":
						case "zm":
						case "zw":
						case "ac":
						case "bv":
						case "cp":
						case "ea":
						case "dg":
						case "hm":
						case "mf":
						case "sj":
						case "ta":
						case "um":
							//System.out.println("Before the flag, c is " + c);
							output += (":flag_" + flag + ": ");
							c++;
							numberOfEmotes++;
							//System.out.println("After c is " + c);
							break;
						default:
							output += converter.charToEmote(firstChar);
							numberOfEmotes++;
					}
				}
				//System.out.println("At the end of the loop, c is " + c + ". Output is \"" + output + "\"\n");
			}
			output += "  ";
		}
		return new convertedString(input, output, numberOfEmotes);
	}

	public static String charToEmote (char input) {
		if (input >= 'a' && input <= 'z') {
			return (":regional_indicator_" + input + ": ");
		}
		switch (input) {
			case '0':
				return ":zero: ";
			case '1':
				return ":one: ";
			case '2':
				return ":two: ";
			case '3':
				return ":three: ";
			case '4':
				return ":four: ";
			case '5':
				return ":five: ";
			case '6':
				return ":six: ";
			case '7':
				return ":seven: ";
			case '8':
				return ":eight: ";
			case '9':
				return ":nine: ";
			case '!':
				return ":exclamation: ";
			case '?':
				return ":question: ";
			default:
				return input + " ";
		}
	}

}
