package functional01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {

    //假设我们想按照玩家的groupId来给玩家分组，Java8以前，可以这样做：
    public void mapListJava7(List<Player> players) {
        Map<Integer, List<Player>> groups = new HashMap<>();
        for (Player player : players) {
            List<Player> group = groups.get(player.getGroupId());
            if (group == null) {
                group = new ArrayList<>();
                groups.put(player.getGroupId(), group);
            }
            group.add(player);
        }
    }

//    Java8给Map添加了getOrDefault()方法，所以即使不用Lambda，代码也会简单一点：
    public void mapListJava8(List<Player> players) {
        Map<Integer, List<Player>> groups = new HashMap<>();
        for (Player player : players) {
            List<Player> group = groups.getOrDefault(player.getGroupId(), new ArrayList<>());
            group.add(player);
        }
    }

    //用Lambda表达式来更清晰的表达意图：
    public void groupingByJava8(List<Player> players) {
        Map<Integer, List<Player>> groups = players.stream()
                .collect(Collectors.groupingBy(Player::getGroupId));
    }














    //写个类支持以下Player类型。
    class Player{
        private int groupId;

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }
    }
}

