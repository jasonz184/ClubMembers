import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ClubMembers c = new ClubMembers();
        String[] members = 
        {
            "XIA PEISU",
            "ELLIS, CLARENCE",
            "VON AHN, LUIS"
        };
        c.addMembers(members, 2025);
        System.out.println(c.getMemberList());

        MemberInfo[] roster = 
        {
            new MemberInfo("SMITH, JANE", 2019, false),
            new MemberInfo("FOX, STEVE", 2018, true),
            new MemberInfo("XIN, MICHAEL", 2017, false),
            new MemberInfo("GARCIA, MARIA", 2020, true),
        };
        ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();
        for(MemberInfo m : roster) memberList.add(m);
        c.setMemberList(memberList);
        System.out.println(c.removeMembers(2018));
        System.out.println(c.getMemberList());
    }
}