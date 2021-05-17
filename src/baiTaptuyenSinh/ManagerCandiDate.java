package baiTaptuyenSinh;


import java.util.ArrayList;
import java.util.List;

public class ManagerCandiDate {
    List<CandiDate> candidates;
    public ManagerCandiDate() {
        this.candidates = new ArrayList<>();
    }

    public void add(CandiDate candidate) {
        this.candidates.add(candidate);
    }

    public void showInfor() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }

    public CandiDate searchById(String id) {
        return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }


}
