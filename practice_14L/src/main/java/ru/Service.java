package ru;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Service {
    List<AllFunc> a = new ArrayList<AllFunc>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getTestPage() {
        return "test.html";
    }

    /**
     * creating post
     * @param w is a Post object
     */
    @RequestMapping(value = "/home/createpost", method = RequestMethod.POST)
    @ResponseBody
    public void createpost(@RequestBody Post w) {
        a.add(w);
    }

    /**
     * creating user
     * @param w is a User object
     */
    @RequestMapping(value = "/home/createuser", method = RequestMethod.POST)
    @ResponseBody
    public void createuser(@RequestBody User w) {
        a.add(w);
    }

    /**
     * deleting all users
     */
    @RequestMapping(value = "/home/delete", method = RequestMethod.GET)
    public void del() {
        a = new ArrayList<AllFunc>();
    }

    /**
     * shows all existing users
     */
    @RequestMapping(value = "/home/out", method = RequestMethod.GET)
    @ResponseBody
    public List<AllFunc> out() {
        return a;
    }

}
