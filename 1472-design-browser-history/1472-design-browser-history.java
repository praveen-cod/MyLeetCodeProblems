class BrowserHistory {
    Deque<String> browser;
    Deque<String> forward;
    public BrowserHistory(String homepage) {
        browser = new LinkedList<>();
        forward = new LinkedList<>();
        browser.offerFirst(homepage);
    }
    
    public void visit(String url) {
        browser.offerFirst(url);
        forward.clear();
    }
    
    public String back(int steps) {
        String res = "";
        for(int i = 0;i<steps && browser.size()>1;i++){
            res = browser.removeFirst();
            forward.offerFirst(res);
        }
        return browser.peekFirst();
    }
    
    public String forward(int steps) {
        String res = "";
        for(int i = 0;i<steps;i++){
            if(forward.isEmpty()) break;
            res = forward.removeFirst();
            browser.offerFirst(res);
        }
        return browser.peekFirst();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */