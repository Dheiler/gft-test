package dishes.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dishes.enums.Morning;
import dishes.enums.Night;

public class DishService {
	
	public static String montarRespostaMorning(String input) {
		List<Integer> pedidos = montarPedidos(input);
		List<String> saida = new ArrayList<>();
		for (Integer p : pedidos) {
			Morning m = Morning.buscarPorValor(p);
			if (m != null && (!saida.contains(m.getDescricao()) || Morning.COFFEE.getValor() == p)) {
				saida.add(m.getDescricao());
			}else {
				saida.add("error");
			}
		}
		return saida.toString().replaceAll("[\\[\\]]+", "");
	}
	
	public static String montarRespostaNight(String input) {
		List<Integer> pedidos = montarPedidos(input);
		List<String> saida = new ArrayList<>();
		for (Integer p : pedidos) {
			Night n = Night.buscarPorValor(p);
			if (n != null && (!saida.contains(n.getDescricao()) || Night.POTATO.getValor() == p)) {
				saida.add(n.getDescricao());
			}else {
				saida.add("error");
			}
		}
		return saida.toString().replaceAll("[\\[\\]]+", "");
	}

	private static List<Integer> montarPedidos(String s) {
		List<Integer> numbers = new ArrayList<Integer>();
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while(m.find()){
            numbers.add(Integer.parseInt(m.group()));
        }
        numbers.sort(null);
        return numbers;
	}

}
